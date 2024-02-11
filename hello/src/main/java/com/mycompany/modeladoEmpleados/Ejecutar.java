package com.mycompany.modeladoEmpleados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Ejecutar {

    public static void main(String[] args) {

        List<Empleados> empleados = getEmpleados();

        int cantidadEmpleados = empleados.size();
        System.out.println("La empresa cuenta con un equipo de " + cantidadEmpleados + " empleados");

        Double salarioTotal = empleados.stream().mapToDouble(Empleados::getSalario).sum();
        System.out.println("El total de euros que se gasta la empresa al mes son " + salarioTotal + "€");

        System.out.println("El promedio de sueldo por mes es de " + salarioTotal / cantidadEmpleados);

        OptionalDouble maxSueldoAdmin = empleados.stream().filter(e -> e.getClass() == EmpleadosAdministrativos.class).mapToDouble(Empleados::getSalario).max();
        OptionalDouble minSueldoAdmin = empleados.stream().filter(e -> e.getClass() == EmpleadosAdministrativos.class).mapToDouble(Empleados::getSalario).min();

        System.out.println("El sueldo máximo de los administrativos es de " + maxSueldoAdmin + " y el mínimo es de " + minSueldoAdmin);

        OptionalDouble maxSueldoJefe = empleados.stream().filter(e -> e.getClass() == JefesArea.class).mapToDouble(Empleados::getSalario).max();
        OptionalDouble minSueldoJefe = empleados.stream().filter(e -> e.getClass() == JefesArea.class).mapToDouble(Empleados::getSalario).min();

        System.out.println("El sueldo máximo de los jefes es de " + maxSueldoJefe + " y el mínimo es de " + minSueldoJefe);

        OptionalDouble maxSueldoDirector = empleados.stream().filter(e -> e.getClass() == DirectoresDepartamento.class).mapToDouble(Empleados::getSalario).max();
        OptionalDouble minSueldoDirector = empleados.stream().filter(e -> e.getClass() == DirectoresDepartamento.class).mapToDouble(Empleados::getSalario).min();

        System.out.println("El sueldo máximo de los directores es de " + maxSueldoDirector + " y el mínimo es de " + minSueldoDirector);

    }

    private static List<Empleados> getEmpleados() {
        EmpleadosAdministrativos administrativo1 = new EmpleadosAdministrativos("Jorge", "Del Riego", "02345432M", "656400870", null, 22.0, 8.0, 18.0, LocalDate.of(2024, 1, 10));

        administrativo1.calcularSalario();


        EmpleadosAdministrativos administrativo2 = new EmpleadosAdministrativos("Pablo", "Del Riego", "02345432M", "656400870", null, 22.0, 8.0, 12.0, LocalDate.of(2024, 1, 10));

        administrativo2.calcularSalario();


        EmpleadosAdministrativos administrativo3 = new EmpleadosAdministrativos("Rodri", "Del Riego", "02345432M", "656400870", null, 22.0, 8.0, 15.0, LocalDate.of(2024, 1, 10));

        administrativo3.calcularSalario();


        JefesArea jefe1 = new JefesArea("Pepe", "Garcia", "123456P", "659831457", 3265.80, LocalDate.of(2023, 1, 10));
        jefe1.calcularSalario();

        JefesArea jefe2 = new JefesArea("Pepa", "Garcia", "123456P", "659831457", 4265.80, LocalDate.of(2023, 1, 10));
        jefe2.calcularSalario();

        JefesArea jefe3 = new JefesArea("Maria", "Garcia", "123456P", "659831457", 3265.80, LocalDate.of(2023, 1, 10));
        jefe3.calcularSalario();


        DirectoresDepartamento director1 = new DirectoresDepartamento("Gonza", "Del Riego", "145236X", "652879415", 4300.50, LocalDate.of(2022, 1, 10));
        director1.calcularSalario();

        DirectoresDepartamento director2 = new DirectoresDepartamento("Gabi", "Del Riego", "145236X", "652879415", 4300.50, LocalDate.of(2022, 1, 10));
        director2.calcularSalario();

        DirectoresDepartamento director3 = new DirectoresDepartamento("Lucas", "Del Riego", "145236X", "652879415", 7500.50, LocalDate.of(2022, 1, 10));
        director3.calcularSalario();

        List<Empleados> empleados = List.of(administrativo1, administrativo2, administrativo3, jefe1, jefe2, jefe3
                , director1, director2, director3);
        return empleados;
    }
}
