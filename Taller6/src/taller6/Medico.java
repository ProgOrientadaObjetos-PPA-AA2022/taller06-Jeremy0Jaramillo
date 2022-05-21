/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author SALA I
 */
public class Medico {
    
    private String nombre;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico(String n, String t){
        nombre = n;
        especialidad = t;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEspecialidad(String n){
        especialidad = n;
    }
    
    public void establecerSueldoMensual(double n){
        sueldoMensual = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
