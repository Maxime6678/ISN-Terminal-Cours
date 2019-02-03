package commons;

import javax.swing.*;
import java.awt.*;

public class TextField {

    private JTextField textField;

    public TextField(String fontName, Color fontColor, int fontType, int fontSize, int width, int height, Panel panel) {
        this.textField = new JTextField();
        panel.add(this);
        this.textField.setPreferredSize(new Dimension(width, height));
        this.textField.setForeground(fontColor);
        this.textField.setFont(new Font(fontName, fontType, fontSize));
    }

    public TextField(String fontName, Color fontColor, int fontType, int fontSize, Dimension dimension, Panel panel) {
        this.textField = new JTextField();
        panel.add(this);
        this.textField.setPreferredSize(dimension);
        this.textField.setForeground(fontColor);
        this.textField.setFont(new Font(fontName, fontType, fontSize));
    }

    public void setText(String text) {
        this.textField.setText(text);
    }

    public String getText() {
        return this.textField.getText();
    }

    public JTextField getTextField() {
        return textField;
    }
}
