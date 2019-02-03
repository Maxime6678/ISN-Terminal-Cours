package commons;

import javax.swing.*;
import java.awt.*;

public class Label {

    private JLabel label;

    public Label(String text, String fontName, Color fontColor, int fontType, int fontSize, Panel panel) {
        this.label = new JLabel(text);
        panel.add(this);
        this.label.setForeground(fontColor);
        this.label.setFont(new Font(fontName, fontType, fontSize));
    }

    public Label(String text, Color fontColor, Font font, Panel panel) {
        this.label = new JLabel(text);
        panel.add(this);
        this.label.setForeground(fontColor);
        this.label.setFont(font);
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public JLabel getLabel() {
        return label;
    }

    public String getText() {
        return this.label.getText();
    }

}
