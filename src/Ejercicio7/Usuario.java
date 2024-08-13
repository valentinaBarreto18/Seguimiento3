package Ejercicio7;

public class Usuario {
        private String nombre;
        private String identificacion;
        private String telefono;

        public Usuario(String nombre, String identificacion, String telefono) {
            this.nombre = nombre;
            this.identificacion = identificacion;
            this.telefono = telefono;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getIdentificacion() { return identificacion; }
        public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Identificación: " + identificacion + ", Teléfono: " + telefono;
        }
    }


