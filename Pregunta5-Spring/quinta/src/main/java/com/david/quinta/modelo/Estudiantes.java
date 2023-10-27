package com.david.quinta.modelo;

public class Estudiantes {
    private String codigo;
    private String nombre;
    private String curso;
    private double examenFinal;

    public Estudiantes() {
    }

    public Estudiantes(String codigo, String nombre, String curso, double examenFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
        this.examenFinal = examenFinal;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

}
