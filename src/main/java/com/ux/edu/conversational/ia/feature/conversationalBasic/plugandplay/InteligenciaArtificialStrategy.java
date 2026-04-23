package com.ux.edu.conversational.ia.feature.conversationalBasic.plugandplay;

public interface InteligenciaArtificialStrategy {
    String generarRespuesta(String prompt);
    String getNombreModelo();
}