import javax.swing.*;
import java.awt.*;

public class exemple2calcul extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple Layout Managers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel pannel1=new JPanel(new BorderLayout());
