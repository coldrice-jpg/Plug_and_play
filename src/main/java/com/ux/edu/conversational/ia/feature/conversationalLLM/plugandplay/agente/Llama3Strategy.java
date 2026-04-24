package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente;

// Estrategia para Llama3
public class Llama3Strategy implements InteligenciaArtificialStrategy {
    @Override
    public String generarRespuesta(String prompt) {
        return "[Llama3-Ollama]: Analizando con 8B parámetros mediante razonamiento profundo... " + prompt;
    }

    @Override
    public String getNombreModelo() { return "Llama3"; }
}

