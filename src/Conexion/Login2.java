/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author blanc
 */
public class Login2 extends Operacion{
    
     @Override
    public void ejecutar(String... args) {
        String usuario = args[0];
        String contraseña = args[1];
        String sql = "SELECT * FROM Usuario WHERE Usuario = ? AND Contraseña = ?";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al intentar el login");
        }
    }
    
    
}
