import javax.swing.*;
import java.awt.*;

public class flowlayout extends JFrame {
    public static int NBOUTONS=5;
    private JButton boutons[];
    public flowlayout(){
        this.setTitle("Exemple FlowLayout");
        this.setSize(350,180);
        Container contenu=this.getContentPane();
        contenu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        boutons=new JButton[NBOUTONS];
        int n=1;
        for(int i=0;i<NBOUTONS;i++){
             boutons[i]=new JButton("bouton"+n);
            n  *=10;
            contenu.add(boutons[i]);}
}
}