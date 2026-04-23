package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay;

public interface InteligenciaArtificialStrategy {
    String generarRespuesta(String prompt);
    String getNombreModelo();
}