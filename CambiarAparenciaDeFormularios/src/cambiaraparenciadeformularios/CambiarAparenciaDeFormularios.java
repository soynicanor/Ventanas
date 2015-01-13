/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiaraparenciadeformularios;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Nica
 */
public class CambiarAparenciaDeFormularios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }
        // TODO code application logic here
        Formulario nuevo=new Formulario();
        nuevo.setVisible(true);
    }
}
