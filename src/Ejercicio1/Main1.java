package Ejercicio1;

public class Main1 {
    public class Main {
        public static void main(String[] args) {

            Mascota mascota1 = new Mascota("lucas", 3, "Pastor Aleman", "negro");
            Mascota mascota2 = new Mascota("Beethoveen", 2, "San Bernando", "Blanco con negro");
            Mascota mascota3 = new Mascota("lucas", 1, "labrador", "Tricolor");


            System.out.println("Detalles de las mascotas iniciales:");
            mascota1.imprimirDetalles();
            mascota2.imprimirDetalles();
            mascota3.imprimirDetalles();

            mascota1.setNombre("Bobby Jr.");
            mascota1.setEdad(4);
            mascota1.setRaza("Labrador Retriever");
            mascota1.setColor("Negro");


            System.out.println("Detalles de la mascota 1 después de la modificación:");
            mascota1.imprimirDetalles();
        }
    }
}
