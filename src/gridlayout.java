import javax.swing.*;
import java.awt.*;

public class gridlayout {
    class MaFenetre extends JFrame {
        public static int NBOUTONS = 5 ;
        private JButton boutons [ ] ;
        public MaFenetre ( )
        {
            this.setTitle( "Exemple GridLayout" ) ;
            this.setSize( 350 , 180 ) ;
            Container contenu = this.getContentPane( );
            contenu.setLayout(new GridLayout( 4 , 3 , 6 , 4 ) ) ;
            boutons = new JButton [NBOUTONS] ;
            for (int i =0 ; i <NBOUTONS ; i++ ) {
            boutons [i] = new JButton ( "Bouton " + i ) ;
            contenu.add(boutons [i] ) ; }

        }
    }
}
