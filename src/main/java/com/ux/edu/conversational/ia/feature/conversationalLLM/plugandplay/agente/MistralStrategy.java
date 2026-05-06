package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente;

import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.ollama.PromptConfig;

// Estrategia para Mistral
public class MistralStrategy implements InteligenciaArtificialStrategy {
    @Override
    public String generarRespuesta(PromptConfig config) {
        return "";
    }

    @Override
    public String generarRespuesta(String prompt) {
        return "[Mistral-Ollama]: Respuesta rápida y eficiente generada para: " + prompt;
    }

    @Override
    public String getNombreModelo() { return "Mistral"; }
}