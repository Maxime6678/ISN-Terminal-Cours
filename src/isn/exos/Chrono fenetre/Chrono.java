import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chrono implements ActionListener {

    private JPanel panel = new JPanel();
    private JLabel seconds = new JLabel("0 seconde");
    private JButton start = new JButton("Lancer le chronomètre");
    private boolean isChronoStart = false;
    private int i = 0;

    public Chrono() throws InterruptedException {
        // Création de la fenetre
        JFrame window = new JFrame();
        window.setTitle("Chronomètre");
        window.setSize(200, 100);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        // Modification du contenu
        start.addActionListener(this);

        // Ajout des object dans la fenetre
        panel.add(seconds);
        panel.add(start);

        // Affichage de la fenetre
        window.setContentPane(panel);
        window.setVisible(true);

        while (true) {
            if (isChronoStart) {
                Thread.sleep(1000);
                if (!isChronoStart) continue;
                i++;
                seconds.setText(i + " secondes");
            }
            Thread.sleep(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isChronoStart) {
            i = 0;
            isChronoStart = true;
            start.setText("Arreter le chrono");
        } else {
            isChronoStart = false;
            seconds.setText("0 seconde");
            start.setText("Lancer le chrono");
        }
    }

}
