package icons;


import com.janusresearch.genoaModelTool.genoa.impl.EntityImpl;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class CustomIconRenderer extends DefaultTreeCellRenderer {
    /**
     *
     */
    private JLabel label;

    public CustomIconRenderer() {
        label = new JLabel();
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
                                                  boolean sel, boolean expanded, boolean leaf, int row,
                                                  boolean hasFocus) {

        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
                row, hasFocus);

        Object nodeObj = ((DefaultMutableTreeNode) value).getUserObject();


        if (nodeObj instanceof EntityImpl) {
            EntityImpl tempEntityImpl = (EntityImpl) nodeObj;
            label.setIcon(GenoaIcons.Objects.Entity);
            label.setText(tempEntityImpl.getName());
        }
        return this.label;
    }
}