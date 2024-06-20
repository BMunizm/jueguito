/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jueguito;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String enunciado;
    private List<String> opciones;
    private int respuestaCorrecta;

    public Pregunta(String enunciado, List<String> opciones, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public static List<Pregunta> generarPreguntas() {
        List<Pregunta> preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?",
                                    List.of("París", "Madrid", "Londres", "Roma"),
                                    0));
        
        preguntas.add(new Pregunta("¿Cuál es el océano más grande?",
                                    List.of("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Océano Ártico"),
                                    2));
        
        preguntas.add(new Pregunta("¿Quién escribió 'Cien años de soledad'?",
                                    List.of("Gabriel García Márquez", "Mario Vargas Llosa", "Pablo Neruda", "Julio Cortázar"),
                                    0));
        
        preguntas.add(new Pregunta("¿En qué año llegó el hombre a la luna?",
                                    List.of("1965", "1969", "1972", "1975"),
                                    1));
        
        preguntas.add(new Pregunta("¿Cuál es la fórmula química del agua?",
                                    List.of("H2O", "CO2", "O2", "NaCl"),
                                    0));
        
        preguntas.add(new Pregunta("¿Quién pintó la Mona Lisa?",
                                    List.of("Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"),
                                    0));
        
        // Agrega más preguntas aquí
        preguntas.add(new Pregunta("¿Cuál es la capital de Japón?",
                                    List.of("Beijing", "Seúl", "Tokio", "Bangkok"),
                                    2));
        
        preguntas.add(new Pregunta("¿Qué planeta es conocido como el planeta rojo?",
                                    List.of("Venus", "Marte", "Júpiter", "Saturno"),
                                    1));
        
        return preguntas;
    }
}
