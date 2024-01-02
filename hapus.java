/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasejava;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS
 */
public class hapus {
    Koneksi konek = new Koneksi();

    public void delete(String nama) {

        try {
            konek.Koneksi();

            // Query DELETE
            String sql = "DELETE FROM bukutamu WHERE nama = ?";

            // Menggunakan PreparedStatement
            try (PreparedStatement preparedStatement = konek.con.prepareStatement(sql)) {
                // Mengatur parameter PreparedStatement
                preparedStatement.setString(1, nama);

                // Menjalankan query DELETE
                int rowsAffected = preparedStatement.executeUpdate();

                
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
