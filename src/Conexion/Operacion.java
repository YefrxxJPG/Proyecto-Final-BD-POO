/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author blanc
 */
public abstract class Operacion  {
    protected Conexion conexion ;
    
   public Operacion(){
       this.conexion = new Conexion();
   }
    
   public abstract void ejecutar(String... args);
    
}
