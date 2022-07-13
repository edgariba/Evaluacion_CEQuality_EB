package com.example.pruebaEb.Ejercicios;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio2 {

    public static void main(String[] args) {
        String word = "ZASERSSTEDFGGQAAEZ";
        String[] splitWords = word.replace(" ", "").split("");
        countCharacters(splitWords);
    }

    /**
     * Metodo para contar el numero de veces que se repite un caracter
     * @param splitWords
     */
    private static void countCharacters(String[] splitWords) {
        Map<String, Integer> mapCharacters = new TreeMap<>();
        for (String letters : splitWords) {
            if (mapCharacters.containsKey(letters)) {
                mapCharacters.put(letters, mapCharacters.get(letters) +1);
            } else {
                mapCharacters.put(letters, 1);
            }
        }
        System.out.println(mapCharacters);
    }
}
