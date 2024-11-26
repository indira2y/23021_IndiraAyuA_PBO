/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package japaw;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author I_PF4
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.next();
        
        try {
            Connection connection = Koneksi.konek();
            System.out.println("Koneksi berhasil!");

            // Menggunakan PreparedStatement untuk keamanan lebih baik
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, uname);
                preparedStatement.setString(2, passwd);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Login berhasil");
                    } else {
                        System.out.println("Username atau password salah");
                    }
                }
            }
            
            // Menutup koneksi
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
