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
public class Actualizarfrutas extends Operacion{
 
    @Override
    public void ejecutar(String... args){
        
        int id = Integer.parseInt(args[0]);
        String nuevoNombre = args[1];
        String sql = "UPDATE frutas SET nombre = ? WHERE id_frutas = ?";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoNombre);
            ps.setInt(2, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Fruta actualizada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró fruta con el ID especificado");
            }
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al actualizar la fruta");
        }
    }
}
