package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente;

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

        // Usando la nueva estrategia Phi3 sin haber modificado AgenteConversacional
        coreliaAgent.setModelo(new Phi3Strategy());
        coreliaAgent.interactuar("¿Cuál es la ventaja de los modelos SLM (Small Language Models)?");
    }
}
