/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona {
    private String despacho;

    public Profesor() {
    }

    public Profesor(String despacho) {
        this.despacho = despacho;
    }

    public Profesor(String despacho, String nombre, String apellido, int cedula, Direccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    

    @Override
    public String identificacion() {
         return "Profesor";
        }

    @Override
    public String toString() {
        return "DATOS DEL PROFESOR\n"+
                "Nombres:"+getNombre()+"\n"+
                "Apellidos:"+getApellido()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Despacho"+getDespacho();
                }
    
}
