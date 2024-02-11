package com.mycompany.modeladoEmpleados;

import java.time.LocalDate;
import java.time.Period;

public class EmpleadosAdministrativos extends Empleados{

    private Double horasDia;
    private Double diasTrabajados;
    private Double salarioPorHora;

    public EmpleadosAdministrativos(
            String nombre,
            String apelliido,
            String numSeguridadSocial,
            String numTelefono,
            Double salario,
            Double diasTrabajados,
            Double horasDia,
            Double salarioPorHora,
            LocalDate fechaIngreso
            ) {
        super(nombre, apelliido, numSeguridadSocial, numTelefono, salario, fechaIngreso);
        this.horasDia=horasDia;
        this.salarioPorHora=salarioPorHora;
        this.diasTrabajados=diasTrabajados;

    }

    @Override
    void calcularSalario() {
        calcularAntiguedad();
        Double salarioTotal= (horasDia*diasTrabajados) * salarioPorHora;
        setSalario(salarioTotal);
    }

    @Override
    void calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(getFechaIngreso(), fechaActual);
        setAntiguedad(periodo.getYears()+1);
    }

    @Override
    public String toString() {
        return "EmpleadosAdministrativos "+ super.toString() +
                "dias trabajados=" +diasTrabajados+
                " horas trabajadas=" + horasDia +
                ", salarioPorHora=" + salarioPorHora +
                "} " ;
    }
}
