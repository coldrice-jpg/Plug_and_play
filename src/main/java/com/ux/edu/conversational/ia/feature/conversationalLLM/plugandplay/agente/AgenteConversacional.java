package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente;

import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.implementacion.estrategias.GemmaStrategy;
import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.implementacion.estrategias.IAStrategy;
import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.implementacion.estrategias.Llama3Strategy;
import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.implementacion.estrategias.PromptConfig;

public class AgenteConversacional {
    private InteligenciaArtificialStrategy modelo;

    // Inyección de la estrategia: permite cambiar el modelo en cualquier momento
    public void setModelo(InteligenciaArtificialStrategy nuevoModelo) {
        this.modelo = nuevoModelo;
        System.out.println("\n[SISTEMA]: Cambiando motor de IA a: " + nuevoModelo.getNombreModelo());
    }

    public void interactuar(String mensaje) {
        if (modelo == null) {
            System.err.println("Error: No se ha seleccionado ningún modelo de IA.");
            return;
        }
        System.out.println(modelo.generarRespuesta(mensaje));
    }
    private IAStrategy strategy;

    // Método para cambiar el "cerebro" en tiempo de ejecución
    public void setStrategy(Llama3Strategy strategy) {
        this.strategy = strategy;
    }

    public String procesarConsulta(PromptConfig config) {
        if (strategy == null) {
            return "Error: No se ha seleccionado una estrategia de IA.";
        }

        // ¡CRITICAL!: Debe retornar el resultado de la estrategia
        return strategy.generarRespuesta(config);
    }

    public void setStrategy(GemmaStrategy gemmaStrategy) {
    }
}