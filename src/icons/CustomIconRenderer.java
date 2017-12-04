package icons;

import com.janusresearch.genoaModelTool.debug.Debug;
import com.janusresearch.genoaModelTool.genoa.Entity;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.net.MalformedURLException;

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

        if (nodeObj instanceof Entity) {
            Entity tempEntity = (Entity) nodeObj;
            label.setIcon(GenoaIcons.Objects.Entity);
            label.setText(tempEntity.getName());
        }
        else {
            label.setIcon(null);
        }

        // check whatever you need to on the node user object
        /*switch(elementType) {
            case "addToCollection" :
                setIcon(GenoaIcons.Objects.AddToCollection);
                break;
            case "alias" :
                setIcon(GenoaIcons.Objects.Alias);
                break;
            case "assignment" :
                setIcon(GenoaIcons.Objects.Assignment);
                break;
            case "attr" :
                switch (dataType) {
                    case "boolean" :
                        setIcon(GenoaIcons.DataTypes.BooleanType);
                        break;
                    case "float" :
                        setIcon(GenoaIcons.DataTypes.FloatType);
                        break;
                    case "int" :
                        setIcon(GenoaIcons.DataTypes.IntType);
                        break;
                    case "String" :
                        setIcon(GenoaIcons.DataTypes.StringType);
                        break;
                    default :
                        setIcon(GenoaIcons.Objects.Choices);
                }
                break;
            case "attributeSetting" :
                setIcon(GenoaIcons.Objects.AttributeSetting);
                break;
            case "behavior" :
                setIcon(GenoaIcons.Objects.Behavior);
                break;
            case "clause" :
                setIcon(GenoaIcons.Objects.Clause);
                break;
            case "choices" :
                setIcon(GenoaIcons.Objects.Choices);
                break;
            case "constraint" :
                setIcon(GenoaIcons.Objects.Constraint);
                break;
            case "entity" :
                setIcon(GenoaIcons.Objects.Entity);
                break;
            case "entityVariable" :
                setIcon(GenoaIcons.Objects.EntityVariable);
                break;
            case "factPattern" :
                setIcon(GenoaIcons.Objects.FactPattern);
                break;
            case "getProperty" :
                setIcon(GenoaIcons.Objects.GetProperty);
                break;
            case "instantiation" :
                setIcon(GenoaIcons.Objects.Instantiation);
                break;
            case "literal" :
                setIcon(GenoaIcons.Objects.Literal);
                break;
            case "message" :
                setIcon(GenoaIcons.Objects.Message);
                break;
            case "model" :
                setIcon(GenoaIcons.Objects.Model);
                break;
            case "null" :
                setIcon(GenoaIcons.Objects.Null);
                break;
            case "paramPropertyPath" :
                setIcon(GenoaIcons.Objects.ParamPropertyPath);
                break;
            case "propertyBinding" :
                setIcon(GenoaIcons.Objects.PropertyBinding);
                break;
            case "propertyPath" :
                setIcon(GenoaIcons.Objects.PropertyPath);
                break;
            case "propertyPathSetting" :
                setIcon(GenoaIcons.Objects.PropertyPathSetting);
                break;
            case "prototype" :
                setIcon(GenoaIcons.Objects.Prototype);
                break;
            case "relationshipSetting" :
                setIcon(GenoaIcons.Objects.RelationshipSetting);
                break;
            case "removeFromCollection" :
                setIcon(GenoaIcons.Objects.RemoveFromCollection);
                break;
            case "retractBean" :
                setIcon(GenoaIcons.Objects.RetractBean);
                break;
            case "setProperty" :
                setIcon(GenoaIcons.Objects.SetProperty);
                break;
            case "simpleVariable" :
                setIcon(GenoaIcons.Objects.SimpleVariable);
                break;
            case "sort" :
                setIcon(GenoaIcons.Objects.Sort);
                break;
            case "toMany" :
                setIcon(GenoaIcons.Objects.ToMany);
                break;
            case "toManyList" :
                setIcon(GenoaIcons.Objects.ToManyList);
                break;
            case "toManyListSetting" :
                setIcon(GenoaIcons.Objects.ToManyListSetting);
                break;
            case "toManyMap" :
                setIcon(GenoaIcons.Objects.ToManyMap);
                break;
            case "toManySetting" :
                setIcon(GenoaIcons.Objects.ToManySetting);
                break;
            case "toManyType" :
                setIcon(GenoaIcons.Objects.ToManyType);
                break;
            case "toOne" :
                setIcon(GenoaIcons.Objects.ToOne);
                break;
            case "variableRef" :
                setIcon(GenoaIcons.Objects.VariableRef);
                break;
            case "variableRef1" :
                setIcon(GenoaIcons.Objects.VariableRef1);
                break;

        }*/


        return this.label;
    }
}