import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class exemple2calcul extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice Layout Managers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        Container contenu = frame.getContentPane();
        JTextField txt = new JTextField();
        txt.setPreferredSize(new Dimension(280,40));
        txt.setFont(new Font("Arial", Font.PLAIN, 25));
        txt.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contenu.add(txt, BorderLayout.NORTH);

        GridLayout grid = new GridLayout(5, 4);
        JPanel gridpanel = new JPanel(grid);
        List<String> v = Arrays.asList(
                "C", "±", "%", "÷",
                "7", "8", "9", "×",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "◻", "=");
        for (String val : v) {
            gridpanel.add(new JButton(val));
        }
        contenu.add(gridpanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

