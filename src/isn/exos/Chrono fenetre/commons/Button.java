package commons;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Button implements ActionListener {

    private JButton button;

    public Button(String text, String fontName, Color fontColor, int fontType, int fontSize, Panel panel) {
        this.button = new JButton(text);
        panel.add(this);
        this.button.setForeground(fontColor);
        this.button.setFont(new Font(fontName, fontType, fontSize));
        this.button.addActionListener(this::onClick);
    }

    public Button(String text, Color fontColor, Font font, Panel panel) {
        this.button = new JButton(text);
        panel.add(this);
        this.button.setForeground(fontColor);
        this.button.setFont(font);
        this.button.addActionListener(this::onClick);
    }

    public void setText(String text) {
        this.button.setText(text);
    }

    public String getText() {
        return this.button.getText();
    }

    public JButton getButton() {
        return button;
    }

    public abstract void onClick(ActionEvent e);

}
