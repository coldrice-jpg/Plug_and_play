package com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.ollama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IntentRouter router = new IntentRouter();
        Llama3Strategy llamaStrategy = new Llama3Strategy();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu consulta: ");
        String userInput = scanner.nextLine();

        String rolIdentificado = router.determinarRol(userInput);
        String instrucciones = router.optimizarInstrucciones(userInput);

        PromptConfig config = new PromptConfig(
                rolIdentificado,
                "Responde de forma concisa y profesional.",
                instrucciones
        );


        System.out.println("\n[Consultando al modelo: " + llamaStrategy.getNombreModelo() + "...]");

        String respuestaFinal = llamaStrategy.generarRespuesta(config);

        System.out.println("\n" + respuestaFinal);

        scanner.close();
    }
}
