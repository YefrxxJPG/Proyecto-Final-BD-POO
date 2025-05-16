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
public class Eliminarfrutas extends Operacion {
    
    @Override
    public void ejecutar(String... args){
        
        int id = Integer.parseInt(args[0]);
        String sql = "DELETE FROM frutas WHERE id_frutas = ?";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Fruta eliminada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró fruta con el ID especificado");
            }
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al eliminar la fruta");
        }
    }
}
