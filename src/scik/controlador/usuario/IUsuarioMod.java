package scik.controlador.usuario;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de usuario
 * 
 * Metodos disponibles para el controlador de moficacion de usuario
 *  
 */

public interface IUsuarioMod
{
    public void cancelar();
    public void cargar( JTextField txtUsrCod, JTextField txtUsrIde, JFormattedTextField txtDNI, JTextField txtUsrNom, JTextField txtUsrApe, JRadioButton rbAdmin, JRadioButton rbUsuario);
    public void aceptar(JTextField txtUsrCod, JTextField txtUsrIde, JPasswordField txtCon, JPasswordField txtRepCon, JFormattedTextField txtDNI, JTextField txtUsrNom, JTextField txtUsrApe, JRadioButton rbAdmin);
}
