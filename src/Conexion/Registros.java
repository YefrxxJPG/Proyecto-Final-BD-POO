/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author blanc
 */
public class Registros extends Operacion{
    
    @Override
    public void ejecutar(String... args) {
        String usuario = args[0];
        String contraseña = args[1];
        String sql = "INSERT INTO Usuario(Usuario,Contraseña) VALUES(?, ?)";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
        }
    }
    
    
}
