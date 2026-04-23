package com.ux.edu.conversational.ia.feature.conversationalBasic.plugandplay;

public class Main {
    public static void main(String[] args) {
        AgenteConversacional coreliaAgent = new AgenteConversacional();

        // 1. Tarea de razonamiento: Usamos Llama3
        coreliaAgent.setModelo(new Llama3Strategy());
        coreliaAgent.interactuar("Explica la importancia de la arquitectura de software.");

        System.out.println("---------------------------------------------------------");

        // 2. Tarea ligera: Cambiamos a Mistral instantáneamente
        coreliaAgent.setModelo(new MistralStrategy());
        coreliaAgent.interactuar("Dame un resumen de 3 líneas sobre el patrón Strategy.");
    }
}
