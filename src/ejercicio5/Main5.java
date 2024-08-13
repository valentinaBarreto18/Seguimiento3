package ejercicio5;

public class Main5 {
    public class Main {
        public static void main(String[] args) {
            // Crear un arreglo de 5 habitaciones
            Habitacion[] habitaciones = new Habitacion[5];

            // Inicializar las habitaciones con datos de ejemplo
            habitaciones[0] = new Habitacion(101, 50.0, true, "");
            habitaciones[1] = new Habitacion(102, 75.0, false, "John Doe");
            habitaciones[2] = new Habitacion(103, 60.0, true, "");
            habitaciones[3] = new Habitacion(104, 80.0, false, "Jane Smith");
            habitaciones[4] = new Habitacion(105, 65.0, true, "");

            // Recorrer el arreglo e imprimir los datos de cada habitación
            System.out.println("Datos de las habitaciones:");
            for (Habitacion habitacion : habitaciones) {
                System.out.println("Número de Habitación: " + habitacion.getNumeroHabitacion());
                System.out.println("Precio por Noche: " + habitacion.getPrecioPorNoche());
                System.out.println("Disponibilidad: " + (habitacion.isDisponibilidad() ? "Disponible" : "Ocupada"));
                System.out.println("Huéspedes Alojados: " + habitacion.getHuespedesAlojados());
                System.out.println();
            }


            habitaciones[2].setPrecioPorNoche(70.0);
            habitaciones[2].setDisponibilidad(false);
            habitaciones[2].setHuespedesAlojados("Carlos Pérez");


            System.out.println("Datos de las habitaciones después de la modificación:");
            for (Habitacion habitacion : habitaciones) {
                System.out.println("Número de Habitación: " + habitacion.getNumeroHabitacion());
                System.out.println("Precio por Noche: " + habitacion.getPrecioPorNoche());
                System.out.println("Disponibilidad: " + (habitacion.isDisponibilidad() ? "Disponible" : "Ocupada"));
                System.out.println("Huéspedes Alojados: " + habitacion.getHuespedesAlojados());
                System.out.println();
            }
        }
    }

}
