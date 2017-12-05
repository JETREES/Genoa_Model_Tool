import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowManager;
import com.janusresearch.genoaModelTool.gui.GenoaEditor;


public class GenoaModelTool extends AbstractProjectComponent{
    private Project project;

    protected GenoaModelTool(Project p) {
        super(p);
        project = p;
    }

    @Override
    public void projectOpened() {
        //Create the Genoa ModelImpl Tool Window when a project is opened
        ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(project);
        ToolWindow toolWindow = toolWindowManager.registerToolWindow("Genoa ModelImpl Tool", false, ToolWindowAnchor.RIGHT);
        GenoaEditor genoaEditor = new GenoaEditor(project);
        genoaEditor.createToolWindowContent(project, toolWindow);

        //Debug.updateIconClass();
    }
}
