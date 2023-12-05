package scik.controlador.unidad;

import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de unidad
 * 
 * Metodos disponibles para el controlador de moficacion de unidad
 *  
 */

public interface IUnidadMod
{
    public void cargar(JTextField txtUniCod, JTextField txtUniDes);
    public void aceptar(JTextField txtUniDes);
    public void cancelar();
}
