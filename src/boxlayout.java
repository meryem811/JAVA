import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;


public class boxlayout extends JFrame {
    public Box bhor;
    public JButton b1,b2;
    private JTextField txt;
    public  boxlayout() {
        this .setTitle("exemple boxlayout horizontal");
        this.setSize(550,100);
        Container contenu= this.getContentPane();
        Box bHor=Box.createHorizontalBox();
        contenu.add(bHor);
        b1=new JButton ("bouton1");
        bHor.add(b1);
        txt=new JTextField (20);
        bHor.add(txt);
        b2=new JButton("bouton2");
        bHor.add(b2);
    }

}
