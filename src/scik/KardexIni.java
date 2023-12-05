package scik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.UIManager;

import scik.controlador.CLogin;
import scik.modelo.Conexion;
import scik.modelo.Usuario;

public class KardexIni {

    /**
     * Objeto global utilizado para la conexion con la base de datos, sus
     * atributos van cambiando durante la ejecucion del software y dependiendo
     * de la configuracion.
     */
    public static Conexion con;

    /**
     * Objeto global que identifica al usuario actual que hace uso del sistema
     * con sus respectivos permisos, ya sea de administrador o de usuario.
     */
    public static Usuario user;

    /**
     * Constructor principal, inicializa el LaF JTattoo y lee archivo
     * 'conexion.dat' donde se encuentran datos de configuracion de la conexion
     * con la base de datos en MySQL.
     */
    public KardexIni() {
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

            String[] conexion_data = new String[3];
            FileReader fr = new FileReader("conexion.dat");
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            int number = 0;

            while ((linea = br.readLine()) != null) {
                conexion_data[number] = linea.substring(linea.indexOf("=") + 1, linea.length());
                number++;
                if (number > 2) {
                    break;
                }
            }

            con = new Conexion(conexion_data[0], "BD_KARDEX", conexion_data[1], conexion_data[2]);
            con.conectar(false);
            user = new Usuario();

            new CLogin();
        //} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException | FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) {
        new KardexIni();
    }
}
