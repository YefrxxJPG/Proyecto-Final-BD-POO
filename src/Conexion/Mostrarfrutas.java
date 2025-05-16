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
public class Mostrarfrutas extends Operacion{
    
    @Override
    public void ejecutar(String... args){
        String sql = "SELECT * FROM frutas";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            StringBuilder result = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("id_frutas");
                String nombre = rs.getString("nombre");
                result.append("ID: ").append(id).append(", Nombre: ").append(nombre).append("\n");
            }
            JOptionPane.showMessageDialog(null, result.toString());
        } catch (SQLException e) {
            System.out.println("Errores: " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar las frutas");
        }
        
        
    }
    
    
}
