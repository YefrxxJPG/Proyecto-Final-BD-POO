/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
    public final static String url="jdbc:mysql://localhost:3306/fruteria";
    public final static String user="root";
    public final static String pass="Yefri1230.";
    
    public Connection getConnection()throws SQLException{
    
        return DriverManager.getConnection(url,user,pass);
        
            }
            }