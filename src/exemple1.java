import javax.swing.*;
import java.awt.*;

public class exemple1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple Layout Managers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel pannel1=new JPanel(new BorderLayout());
        Box bhor = Box.createHorizontalBox();
        bhor.add(new JButton("Bouton1"));
        bhor.add(Box.createGlue());
        bhor.add(new JButton("Bouton2"));
        bhor.add(Box.createHorizontalStrut(10));
        bhor.add(new JButton("Bouton3"));
        pannel1.add(bhor, BorderLayout.NORTH);


        GridLayout grid = new GridLayout(2,3);
        JPanel gridpanel = new JPanel(grid);
        for (int i = 1; i <= 6; i++) {
            gridpanel.add(new JButton("Btn " + i));
        }
        pannel1.add(gridpanel, BorderLayout.CENTER);

        JPanel mainpanel = new JPanel(new BorderLayout());
        mainpanel.add(pannel1, BorderLayout.NORTH);

        Box bver = Box.createVerticalBox();
        bver.add(new JButton("Premier"));
        bver.add(Box.createGlue());
        bver.add(new JButton("Deuxième"));
        bver.add(Box.createVerticalStrut(5));
        bver.add(new JButton("Troisième"));
        mainpanel.add(bver, BorderLayout.EAST);

        frame.setContentPane(mainpanel);
        frame.setVisible(true);
    }
}