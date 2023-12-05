package scik.controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import scik.vista.UIKardexMenu;
import scik.controlador.almacen.CAlmacen;
import scik.controlador.documento.CDocumento;
import scik.controlador.unidad.CUnidad;
import scik.controlador.usuario.CUsuario;
import static scik.KardexIni.user;
import scik.controlador.consulta.CEntrada;
import scik.controlador.consulta.CExistencia;
import scik.controlador.consulta.CSalida;
import scik.controlador.kardex.CKardex;
import scik.controlador.producto.CProducto;

/**
 * Controlador del Menu Principal
 * 
 * Carga las opciones correspondientes dependiendo del tipo de usuario y redirige
 * hacia las diferentes vistas correspondientes.
 *  
 */


public class CKardexMenu implements IKardexMenu
{
    private UIKardexMenu ventana;
    
    public CKardexMenu()
    {
        ventana = new UIKardexMenu(this);
    }
    
    @Override
    public void almacen()
    {
        new CAlmacen();
        ventana.dispose();
    }
    @Override
    public void cargar(JTextField txtNombre, JTextField txtDni, JLabel lblPermisos, JButton btnUsuario, JButton btnExistencia, JButton btnEntrada, JButton btnSalida)
    {
        txtNombre.setText(user.getUsrNom() + " " + user.getUsrApe());
        txtDni.setText("DNI Nº " + user.getUsrDni());
        String permiso = "";
        if(user.getUsrPer().equals("1"))
            permiso = "Administrador";
        else
            permiso = "Usuario";
        lblPermisos.setText(permiso);
        if(user.getUsrPer().equals("0"))
        {
            btnUsuario.setEnabled(false);
            btnExistencia.setEnabled(false);
            btnEntrada.setEnabled(false);
            btnSalida.setEnabled(false);
        }
    }
    
    @Override
    public void cerrarSesion()
    {
        new CLogin();
        ventana.dispose();
    }
    
    @Override
    public void usuario()
    {
        new CUsuario();
        ventana.dispose();
    }
    
    @Override
    public void unidad()
    {
        new CUnidad();
        ventana.dispose();
    }
    
    @Override
    public void documento()
    {
        new CDocumento();
        ventana.dispose();
    }
    
    @Override
    public void producto()
    {
        new CProducto();
        ventana.dispose();
    }
    
    @Override
    public void configuracion()
    {
        new CConfiguracion(false);
        ventana.dispose();
    }
    
    @Override
    public void kardex()
    {
        new CKardex();
        ventana.dispose();
    }

    @Override
    public void existenciaProducto()
    {
        new CExistencia();
        ventana.dispose();
    }

    @Override
    public void salida()
    {
        new CSalida();
        ventana.dispose();
    }

    @Override
    public void entrada()
    {
        new CEntrada();
        ventana.dispose();
    }
}
