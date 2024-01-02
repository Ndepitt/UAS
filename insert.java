/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasejava;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class insert {

  Koneksi konek = new Koneksi ();

    public void insert(String nama, String alamat, String nohp, String jeniskelamin) {
        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();
            // Gunakan PreparedStatement untuk mencegah SQL Injection
            String sql = "INSERT INTO bukutamu (nama, alamat, nohp, jeniskelamin) VALUES (?, ?, ?, ?)";

            // Menggunakan PreparedStatement
            try (PreparedStatement preparedStatement = konek.con.prepareStatement(sql)) {
                // Mengatur parameter PreparedStatement
                preparedStatement.setString(1, nama);
                preparedStatement.setString(2, alamat);
                preparedStatement.setString(3, nohp);
                preparedStatement.setString(4, jeniskelamin);

                // Menjalankan query INSERT
                preparedStatement.executeUpdate();
            }

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }
}