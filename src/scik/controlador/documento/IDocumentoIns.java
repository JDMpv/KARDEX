package scik.controlador.documento;

import javax.swing.JTextField;

/**
 * Interfaz de la insercion de documento
 * 
 * Metodos disponibles para el controlador de insercion de documento
 *  
 */

public interface IDocumentoIns
{
    public void cargar(JTextField txtDocCod);
    public void cancelar();
    public void aceptar(JTextField txtDocCod, JTextField txtDocNom);
}
