package org.example;

import java.util.ArrayList;
public class TablaCompacta {
    private ArrayList<Integer> datosCompactos; // Declaramos un ArrayList para almacenar los datos

    public TablaCompacta() {
        datosCompactos = new ArrayList<>(); // Inicializamos el ArrayList en el constructor
    }

    public void agregarDato(int dato) {
        datosCompactos.add(dato); // Método para agregar un dato a la tabla
    }

    public void imprimirDatos() {
        System.out.println("Datos en la tabla compacta:"); // Método para imprimir los datos almacenados en la tabla
        for (int dato : datosCompactos) { // Iteramos sobre los datos y los imprimimos
            System.out.print(dato + " ");
        }
        System.out.println();
    }
}