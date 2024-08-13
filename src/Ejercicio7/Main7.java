package Ejercicio7;

public class Main7 {
        public static void main(String[] args) {

            Libro[] libros = new Libro[3];
            libros[0] = new Libro("978-3-16-148410-0", "El Gran Rey", "F. Scott", 1925, "Scribner", 180, new String[]{"Ficción", "Clásico"});
            libros[1] = new Libro("978-1-56619-909-4", "1984", "George Orwell", 1949, "Secker & Warburg", 328, new String[]{"Ficción", "Distopía"});
            libros[2] = new Libro("978-0-7432-7356-5", "Matar a un ruiseñor", "Harper Lee", 1960, "J.B. Lippincott & Co.", 281, new String[]{"Ficción", "Drama"});


            Usuario[] usuarios = new Usuario[2];
            usuarios[0] = new Usuario("Geraldine Quintero", "0123456", "322-1234");
            usuarios[1] = new Usuario("Ana Gómez", "0654321", "313-5678");


            Prestamo[] prestamos = new Prestamo[2];
            prestamos[0] = new Prestamo("978-3-16-148410-0", "0123456", "2024-08-12", "2024-08-26");
            prestamos[1] = new Prestamo("978-1-56619-909-4", "0654321", "2024-08-12", "2024-08-26");


            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }


            System.out.println("\nUsuarios:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }

            System.out.println("\nPréstamos realizados:");
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
        }
    }


