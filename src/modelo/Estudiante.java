/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona1 implements Humano,Hijo{

   private int idEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(int idEstudiante, String nombre, String apellido, int cedula, Direccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "ESTUDIANTE\n"+
               "Nombres:"+getNombre()+"\n"+
                "Apellidos:"+getApellido()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Código Estudiante:"+getIdEstudiante()
                ; 
    }

    @Override
    public String padre() {
        return "Persona";  }

    @Override
    public void identificacion() {
        System.out.println("Estudiante");
           }
   
    
    
}
