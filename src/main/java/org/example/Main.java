package org.example;

public class Main {

    public static void main(String[] args) {
        TablaCompacta tabla = new TablaCompacta(); // Creamos una nueva instancia de TablaCompacta
        tabla.agregarDato(10); // Agregamos datos a la tabla
        tabla.agregarDato(20);
        tabla.agregarDato(30);
        tabla.imprimirDatos(); // Imprimimos los datos almacenados en la tabla
    }
}