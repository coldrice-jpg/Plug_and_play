package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay;

// Nueva estrategia: Phi3 (Modelo de Microsoft)
public class Phi3Strategy implements InteligenciaArtificialStrategy {
    @Override
    public String generarRespuesta(String prompt) {
        return "[Phi3-Ollama]: Modelo ligero de Microsoft procesando: " + prompt;
    }

    @Override
    public String getNombreModelo() {
        return "Phi3";
    }
}