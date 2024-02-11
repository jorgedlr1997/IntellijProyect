package com.mycompany.modeladoEmpleados;

import java.time.LocalDate;
import java.time.Period;

public class DirectoresDepartamento extends Empleados{
    public DirectoresDepartamento(String nombre, String apellido, String numSeguridadSocial, String numTelefono, Double salario, LocalDate fechaIngreso) {
        super(nombre, apellido, numSeguridadSocial, numTelefono, salario, fechaIngreso);

    }

    @Override
    void calcularSalario() {
        calcularAntiguedad();
        setSalario(getSalario() + (getAntiguedad()*1000));
    }

    @Override
    void calcularAntiguedad() {
        LocalDate fechaIngreso = getFechaIngreso();
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaIngreso, fechaActual);
        setAntiguedad(period.getYears());
    }

    @Override
    public String toString() {
        return "DirectoresDepartamento " + super.toString();
    }
}
