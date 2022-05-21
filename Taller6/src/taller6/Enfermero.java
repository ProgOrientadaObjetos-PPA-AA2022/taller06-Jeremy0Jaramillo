/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author SALA I
 */
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public void establecerSueldoMensual(double n){
        sueldoMensual = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
    
}
