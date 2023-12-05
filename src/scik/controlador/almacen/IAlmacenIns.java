package scik.controlador.almacen;

import javax.swing.JTextField;

/**
 * Interfaz de la insercion de almacen
 * 
 * Metodos disponibles para el controlador de insercion de almacen
 *  
 */

public interface IAlmacenIns
{
    public void cargar(JTextField txtAlmCod);
    public void aceptar(JTextField txtAlmCod, JTextField txtAlmNom, JTextField txtAlmUbi);
    public void cancelar();
}
