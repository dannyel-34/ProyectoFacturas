/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conectadb {

    //nombre de la base de datos
    public String db = "dbFacturas";

    //URL del driver
    public String url = "jdbc:postgresql:" + db;

    //user de la bd
    public String user = "postgres";

    //pass del user de la bd
    public String pass = "123";

    public Connection Conectar() {

        Connection link = null;

        try {

            Class.forName("org.postgresql.jdbc");

            link = DriverManager.getConnection(this.url, this.user, this.pass);

            if (link != null) {
                JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Problemas con la conexion ala base de datos ");

        }

        return link;

    }

}
