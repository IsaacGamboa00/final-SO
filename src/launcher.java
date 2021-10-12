import Interfaz.Interfaz;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
}
