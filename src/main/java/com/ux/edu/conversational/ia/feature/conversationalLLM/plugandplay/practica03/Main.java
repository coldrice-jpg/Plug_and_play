package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.practica03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> staff = new ArrayList<>();

        staff.add(new Cocinero());
        staff.add(new Mesero());

        System.out.println("Inicio del turno");
        for (Empleado e : staff) {
            e.saludar();
            e.trabajar();
        }
    }
}