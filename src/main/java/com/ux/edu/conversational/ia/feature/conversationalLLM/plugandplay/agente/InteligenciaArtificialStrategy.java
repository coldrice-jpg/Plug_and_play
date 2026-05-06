package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente;

import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.ollama.PromptConfig;

public interface InteligenciaArtificialStrategy {
    String generarRespuesta(PromptConfig config);

    String generarRespuesta(String prompt);
    String getNombreModelo();
}