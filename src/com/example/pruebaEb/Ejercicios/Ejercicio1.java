package com.example.pruebaEb.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Coleccion 1
         */
        List<String> collection1 = new ArrayList<String>();
        collection1.add("Cánada");
        collection1.add("México");
        collection1.add("Australia");
        collection1.add("Zimbabue");
        collection1.add("Brasil");

        /**
         * Coleccion 2
         */
        List<String> collection2 = new ArrayList<String>();
        collection2.add("Brasil");
        collection2.add("Francia");
        collection2.add("Corea del Norte");
        collection2.add("Corea del Sur");
        collection2.add("Australia");
        verifyExceptions(collection1, "1");
        verifyExceptions(collection2, "2");
        getListMatches(collection1, collection2);
    }

    /**
     * Metodo para verificar si las colecciones son correctas
     * @param keys
     * @param collection
     */
    public static void verifyExceptions(List<String> keys, String collection) {
        if(keys == null || keys.size() == 0 || keys.contains(null) || keys.contains("")){
            throw new IllegalArgumentException("La colección : " + collection + "no es valida !");
        }
    }

    /**
     * Metodo para obtener la colecion3 con las coincidencias
     * @param collection1
     * @param collection2
     */
    private static void getListMatches(List<String> collection1, List<String> collection2) {
        List<String> collectionMatch = new ArrayList<String>();
        for (String c1 : collection1) {
            for (String c2 : collection2) {
                if (c1.equals(c2)) {
                    collectionMatch.add(c1);
                }
            }
        }
        System.out.println("Colección 1: " + collection1);
        System.out.println("Colección 2: " + collection1);
        System.out.println("Colección 3: " + collectionMatch);
    }
}
