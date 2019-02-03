package commons;

import javax.swing.*;

public class Frame {

    private JFrame frame;

    public Frame(String title, int width, int height) {
        this.frame = new JFrame();
        this.frame.setTitle(title);
        this.frame.setSize(width, height);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        //this.frame.setVisible(true);
    }

    public void setPanel(Panel panel) {
        this.frame.setContentPane(panel.getPanel());
        this.frame.setVisible(true);
    }

}
