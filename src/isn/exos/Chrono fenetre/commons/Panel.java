package commons;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;

public class Panel {

    private JPanel panel;

    public Panel(Color background, Frame frame) {
        this.panel = new JPanel();
        this.panel.setBackground(background);
        frame.setPanel(this);
    }

    public void add(Button button) {
        this.panel.add(button.getButton());
    }

    public void add(Label label) {
        this.panel.add(label.getLabel());
    }

    public void add(TextField textField) {
        this.panel.add(textField.getTextField());
    }

    public void setBackground(Color background) {
        this.panel.setBackground(background);
    }

    public void removeAll() {
        this.panel.removeAll();
        this.panel.updateUI();
    }

    public JPanel getPanel() {
        return panel;
    }
}
