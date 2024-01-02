/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasejava;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS
 */
public class Koneksi {
    String statuskoneksi = null;
    
        
    Connection con=null;
    public void Koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/bukutamuundanganpernikahan";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            statuskoneksi = "Berhasil";
        }

        catch(Exception e)
        {
            statuskoneksi = "gagal";
        }
    }
    
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.Koneksi();
    }
}
  
