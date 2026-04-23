package com.ux.edu.conversational.ia.feature.conversationalBasic.plugandplay;

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
}