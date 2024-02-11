package com.mycompany.modeladoEmpleados;

import java.time.LocalDate;

public abstract class Empleados {

    private String nombre;
    private String apellido;
    private String numSeguridadSocial;
    private String numTelefono;
    private Double salario;
    private Integer antiguedad;
    private LocalDate fechaIngreso;

    public Empleados(String nombre, String apellido, String numSeguridadSocial, String numTelefono, Double salario, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSeguridadSocial = numSeguridadSocial;
        this.numTelefono = numTelefono;
        this.salario = salario;
        this.fechaIngreso =  fechaIngreso;
    }

    abstract void calcularSalario();

    abstract void calcularAntiguedad();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelliido() {
        return apellido;
    }

    public void setApelliido(String apelliido) {
        this.apellido = apelliido;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numSeguridadSocial='" + numSeguridadSocial + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}


