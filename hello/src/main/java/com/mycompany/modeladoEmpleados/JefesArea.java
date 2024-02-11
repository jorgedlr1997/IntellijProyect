package com.mycompany.modeladoEmpleados;

import java.time.LocalDate;
import java.time.Period;

public class JefesArea extends Empleados{
    public JefesArea(String nombre, String apellido, String numSeguridadSocial, String numTelefono, Double salario, LocalDate fechaIngreso) {
        super(nombre, apellido, numSeguridadSocial, numTelefono, salario, fechaIngreso);
    }

    @Override
    void calcularSalario() {
        calcularAntiguedad();
        setSalario(getSalario() + getAntiguedad()*100);
    }

    @Override
    void calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(getFechaIngreso(), fechaActual);
        setAntiguedad(periodo.getYears()+1);
    }

    @Override
    public String toString() {
        return "JefesArea " + super.toString();
    }
}
