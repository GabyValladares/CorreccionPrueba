/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Direccion;
import modelo.Estudiante;
import modelo.Profesor;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        //PRIMERA ESTRUCTURA
        Direccion d1=new Direccion("Bolivar", "Ibarra", 100, "Ecuador");
        Profesor p1=new Profesor("A21", "Juan", "Pérez", 1002001001, d1);
        //System.out.println(p1.toString());
        //SEGUNDA ESTRUCTURA
        Estudiante e1=new Estudiante();
        e1.setIdEstudiante(502);
        e1.setNombre("María");
        e1.setApellido("Cruz");
        e1.setCedula(1002003001);
        e1.setDireccion(d1);
        System.out.println(e1.toString());
        
        
        
    }
}
