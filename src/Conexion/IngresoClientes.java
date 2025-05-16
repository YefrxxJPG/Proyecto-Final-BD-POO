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
public class IngresoClientes extends Operacion{
    @Override
    public void ejecutar(String... args) {
        String nombre = args[0];
        String sql = "INSERT INTO clientes (nombre) VALUES(?)";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
        }
    }
}
