package util;

import interfaces.IComponentText;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jerson
 */
public abstract class JPanelModificado extends JPanel implements IComponentText{

    @Override
    public abstract JTextArea getLabelText();
    
}
