/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.tarea4;

/**
 *
 * @author dell
 */
public class modulo4 {
    public static void main(String[] args) {
        
        doctor doctor = new doctor();
        
        
        doctor.setNombre("carlos");
        doctor.setApellido("hernandez");
        doctor.setEdad(30);
        doctor.setañiosExperiencia(8);
        
        
        System.out.println("Nombre doctor:" + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Años de experiencia: " + doctor.getañiosExperiencia());
        
        System.out.println();
        
        hospitaltorax htorax = new hospitaltorax();
        hospitalviera hviera = new hospitalviera();
        hospitaldelcarmen hdelcarmen = new hospitaldelcarmen();
        
        
        System.out.println(htorax.getNombreHospital() + ", director(a): " + htorax.getDirector());
        System.out.println(hviera.getNombreHospital() + ", director(a): " + hviera.getDirector());
        System.out.println(hdelcarmen.getNombreHospital() + ", director(a): " + hdelcarmen.getDirector());

    }
    
}
