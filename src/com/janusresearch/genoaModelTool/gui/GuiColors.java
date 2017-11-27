package com.janusresearch.genoaModelTool.gui;

import com.intellij.ui.JBColor;

class GuiColors extends JBColor {

    static class GenoaTabbedPane {
        final static GuiColors TAB_BACKGROUND = new GuiColors(13948116, 3948095);
        final static GuiColors TAB_FOREGROUND = new GuiColors(16777215, 5330520);
        final static GuiColors BORDER = new GuiColors(15724527, 4934475);
        final static GuiColors CHANGE = new GuiColors(14227737, 14454550);
    }

    private GuiColors(int rgb, int darkRGB) {
        super(rgb, darkRGB);
    }
}
