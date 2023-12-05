package scik.controlador.documento;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import scik.modelo.Documento;
import scik.vista.documento.UIDocumentoIns;

/**
 * Controlador de la insercion de documento
 * 
 * Recibe y valida datos sobre un nuevo registro de documento
 *  
 */

public class CDocumentoIns implements IDocumentoIns
{
    private UIDocumentoIns ventana;
    
    public CDocumentoIns()
    {
        ventana = new UIDocumentoIns(this);
    }
    
    @Override
    public void cargar(JTextField txtDocCod)
    {
        txtDocCod.setText(Documento.sgteCodigo());
    }
    
    @Override
    public void cancelar()
    {
        new CDocumento();
        ventana.dispose();
    }
    
    @Override
    public void aceptar(JTextField txtDocCod, JTextField txtDocNom)
    {
        Documento d = new Documento(txtDocCod.getText(), txtDocNom.getText(), "1");
        String err = d.insertar();
        if(err.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Se ha agregado el registro nuevo", "INSERCION", JOptionPane.INFORMATION_MESSAGE);
            new CDocumento();
            ventana.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, err, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
