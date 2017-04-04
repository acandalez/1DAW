/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.A710;

/**
 *
 * @author 1daw
 */
public class Persona {
    DNI dni;
    String nombre;
    String apellidos;
    Telefono telefonos[];
    int edad;

    public Persona() {
    }

    public Persona(DNI dni, String nombre, String apellidos, Telefono[] telefonos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefonos = telefonos;
        this.edad = edad;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Telefono[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefono[] telefonos) {
        this.telefonos = telefonos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefonos=" + telefonos + ", edad=" + edad + '}';
    }
    
}
