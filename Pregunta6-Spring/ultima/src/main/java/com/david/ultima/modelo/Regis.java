package com.david.ultima.modelo;

public class Regis {
    private String codigo;
    private String nombre;
    private String telefono;
    private String distrito;
    private int edad;

    public Regis() {
    }

    public Regis(String codigo, String nombre, String telefono, String distrito, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.distrito = distrito;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
