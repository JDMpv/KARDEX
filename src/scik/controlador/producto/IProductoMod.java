package scik.controlador.producto;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de producto
 * 
 * Metodos disponibles para el controlador de moficacion de producto
 *  
 */
public interface IProductoMod
{
    public void cargar(JTextField txtProCod, JTextField txtProNom, JTextField txtUniCod, JComboBox cbxUniDes);
    public void cancelar();
    public void verUnidad(JComboBox cbxUniDes, JTextField txtUniCod);
    public void aceptar(JTextField txtProCod, JTextField txtProNom, JTextField txtUniCod);
}
