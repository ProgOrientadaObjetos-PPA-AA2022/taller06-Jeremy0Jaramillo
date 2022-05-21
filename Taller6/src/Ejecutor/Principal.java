/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import taller6.Hospital;
import taller6.Medico;

/**
 *
 * @author SALA I
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hospital h1 = new Hospital("HOSPITAL ZARUMA", "Barrio Central");
        Hospital h2 = new Hospital("ASDJHNKSD", "Las Pitas");
        Hospital h3 = new Hospital("Hospital Bolivariano", "Lojana de Turismo");
        
        Medico medico1 = new Medico("Tara Hernandez", "contratado");
        Medico profesor2 = new Medico("Gregory Walsh", "nombramiento");
        Medico profesor3 = new Medico("Kevin Page", "nombramiento");
        
        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);
        
        Calificacion [] lista = {c1, c2, c3};
        
        
        LibretaCalificacion libreta1 = new LibretaCalificacion("Justin Powers",
                lista);
        libreta1.establecerPromedio();
        libreta1.establecerPromedioCualitativo();
        System.out.println(libreta1);
        
    }
    
}
