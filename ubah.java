/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasejava;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS
 */
public class ubah {
    Koneksi konek = new Koneksi();
     
     public void update(String nama, String alamat, String nohp, String jeniskelamin) {
        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();

            String sql_alamat = "UPDATE bukutamu SET alamat = '" + alamat + "' WHERE nama = '" + nama + "'";
            String sql_nohp = "UPDATE bukutamu SET nohp = '" + nohp + "' WHERE nama = '" + nama + "'";
            String sql_jeniskelamin = "UPDATE bukutamu SET jeniskelamin = '" + jeniskelamin + "' WHERE nama = '" + nama + "'";

            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_nohp);
            statement.executeUpdate(sql_jeniskelamin);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
