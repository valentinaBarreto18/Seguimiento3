package Ejercicio7;

public class Prestamo {
        private String isbnLibro;
        private String identificacionUsuario;
        private String fechaPrestamo;
        private String fechaDevolucion;

        public Prestamo(String isbnLibro, String identificacionUsuario, String fechaPrestamo, String fechaDevolucion) {
            this.isbnLibro = isbnLibro;
            this.identificacionUsuario = identificacionUsuario;
            this.fechaPrestamo = fechaPrestamo;
            this.fechaDevolucion = fechaDevolucion;
        }

        public String getIsbnLibro() { return isbnLibro; }
        public void setIsbnLibro(String isbnLibro) { this.isbnLibro = isbnLibro; }
        public String getIdentificacionUsuario() { return identificacionUsuario; }
        public void setIdentificacionUsuario(String identificacionUsuario) { this.identificacionUsuario = identificacionUsuario; }
        public String getFechaPrestamo() { return fechaPrestamo; }
        public void setFechaPrestamo(String fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }
        public String getFechaDevolucion() { return fechaDevolucion; }
        public void setFechaDevolucion(String fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

        @Override
        public String toString() {
            return "ISBN Libro: " + isbnLibro + ", Identificación Usuario: " + identificacionUsuario +
                    ", Fecha Préstamo: " + fechaPrestamo + ", Fecha Devolución: " + fechaDevolucion;
        }
    }


