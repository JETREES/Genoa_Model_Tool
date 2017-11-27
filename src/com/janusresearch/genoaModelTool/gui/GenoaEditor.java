package com.janusresearch.genoaModelTool.gui;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.util.messages.MessageBus;
import com.intellij.util.messages.MessageBusConnection;
import com.janusresearch.genoaModelTool.dom.GenoaModel;
import icons.GenoaIcons;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class GenoaEditor implements ToolWindowFactory {
    private JPanel genoaToolWindowContent;
    private JBTabbedPane genoaTabbedPane;
    private FileEditorManager mySource;

    public GenoaEditor(Project project) {
        MessageBus messageBus = project.getMessageBus();
        MessageBusConnection connection = messageBus.connect();
        connection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, new FileEditorManagerListener() {

            @Override
            public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
                if (Objects.equals(file.getExtension(), "genoa")) {
                    mySource = source;
                    loadModel(new GenoaModel(project, file));
                }
            }

            @Override
            public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
                if (Objects.equals(file.getExtension(), "genoa")) {
                    Component[] test = genoaTabbedPane.getComponents();
                    int i = 0;
                    for (Component c : test) {
                        if (Objects.equals(c.getName(), file.getNameWithoutExtension())) {
                            genoaTabbedPane.removeTabAt(i - 1);
                        }
                        i++;
                    }
                }
            }
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        createUIComponents();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(genoaToolWindowContent, "", true);
        toolWindow.getContentManager().addContent(content);
    }

    private void createUIComponents() {
        initGenoaTabbedPane();
    }

    private void initGenoaTabbedPane() {
        UIManager.put("TabbedPane.selected", GuiColors.GenoaTabbedPane.TAB_FOREGROUND);
        genoaTabbedPane = new JBTabbedPane();
        genoaTabbedPane.add(new JPanel());
        genoaTabbedPane.removeTabAt(0);
        genoaTabbedPane.setBackground(GuiColors.GenoaTabbedPane.TAB_BACKGROUND);
        genoaToolWindowContent.add(genoaTabbedPane);
    }

    private void loadModel(GenoaModel genoaModel) {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setName(genoaModel.getFileName());
        getGenoaTabbedPane().add(panel);
        getGenoaTabbedPane().setTabComponentAt(getGenoaTabbedPane().indexOfComponent(panel), createTitlePanel(getGenoaTabbedPane(), panel, genoaModel.getFileName(), genoaModel.getMyFile()));
        getGenoaTabbedPane().setToolTipTextAt(getGenoaTabbedPane().indexOfComponent(panel), genoaModel.getFilePath());
    }

    private JPanel createTitlePanel(final JTabbedPane tabbedPane, final JPanel panel, String title, VirtualFile file) {
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        titlePanel.setOpaque(false);
        JLabel titleLbl = new JLabel(title);
        titleLbl.setIcon(GenoaIcons.Objects.GenoaModelFile);
        titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        JButton closeButton = new JButton();
        Dimension buttonDimension = new Dimension(16, 16);
        closeButton.setMinimumSize(buttonDimension);
        closeButton.setPreferredSize(buttonDimension);
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setBackground(null);
        closeButton.setOpaque(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setIcon(GenoaIcons.Actions.CloseFile);
        closeButton.setRolloverIcon(GenoaIcons.Actions.CloseFileHover);
        closeButton.setToolTipText("Close");
        closeButton.addActionListener(e -> {
            tabbedPane.remove(panel);
            getMySource().closeFile(file);

        });
        titlePanel.add(titleLbl);
        titlePanel.add(closeButton);

        return titlePanel;
    }

    @Contract(pure = true)
    private JBTabbedPane getGenoaTabbedPane() {
        return genoaTabbedPane;
    }

    private FileEditorManager getMySource() {
        return mySource;
    }
}
