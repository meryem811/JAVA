import javax.swing.*;
import java.awt.*;

public class borderlayout extends JFrame{
    public static int NBOUTONS =5;
    private JButton boutons[];
    public borderlayout() {
        this.setTitle("exemples borderlayout");
        this.setSize(300, 180);
        Container contenu = this.getContentPane();
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("bouton" + i);
        }
        contenu.add(boutons[0]);
        contenu.add(boutons[1], BorderLayout.NORTH);
        contenu.add(boutons[2], BorderLayout.SOUTH);
        contenu.add(boutons[3], BorderLayout.WEST);
        contenu.add(boutons[4], BorderLayout.EAST);
    }
    }
