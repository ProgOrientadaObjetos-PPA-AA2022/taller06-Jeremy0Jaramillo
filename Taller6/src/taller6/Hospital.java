/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author SALA I
 */
public class Hospital {
    private String nombre;
    private String direccion;
    
    public Hospital (String n, String m){
        nombre = n;
        direccion = m;
    }
    
    
    public void obtenerNombreHostpial(String n){
        nombre = n;
    }
    
    public void obtenerDireccionHospital(String n){
        direccion = n;
    }
    
    public String establecerNombreHospital(){
        return nombre;
    }
    
    public String establecerDireccionHospital(){
        return direccion;
    }
}
