/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Camargo
 */
public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private String usuario;

    public Paciente(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getUsuario() {
        String usuario = null;
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}