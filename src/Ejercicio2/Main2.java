package Ejercicio2;

public class Main2 {

        public static void main(String[] args) {

            Estudiante estudiante1 = new Estudiante("Juan", "Pérez", 10, 15, 4.5, "Ana", "Carlos");
            Estudiante estudiante2 = new Estudiante("María", "Gómez", 11, 16, 4.7, "Lucía", "Pedro", "123456789");
            Estudiante estudiante3 = new Estudiante("Luis", "Martínez", 9, 14, 4.3, "Carmen", "José", "987654321", "112233445");


            estudiante1.imprimirDatos();
            estudiante2.imprimirDatos();
            estudiante3.imprimirDatos();
        }
    }


