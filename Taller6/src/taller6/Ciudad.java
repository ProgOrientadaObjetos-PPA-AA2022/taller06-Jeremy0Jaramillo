/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author SALA I
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public void establecerNombreCiudad(String n){
        nombre = n;
    }
    
    public void establecerProvinciaCiudad(String n){
        provincia = n;
    }
    
    public String obtenerNombreCiudad(){
        return nombre;
    }
    
    public String obtenerProvinciaCiudad(){
        return provincia;
    }
    
}
