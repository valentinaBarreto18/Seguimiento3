package Ejercicio7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Libro {

        private String isbn;
        private String titulo;
        private String autor;
        private int anoPublicacion;
        private String editorial;
        private int numeroPaginas;
        private String[] temas;


        public Libro(String isbn, String titulo, String autor, int anoPublicacion, String editorial, int numeroPaginas, String[] temas) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacion = anoPublicacion;
            this.editorial = editorial;
            this.numeroPaginas = numeroPaginas;
            this.temas = temas;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getAnoPublicacion() {
            return anoPublicacion;
        }

        public void setAnoPublicacion(int anoPublicacion) {
            this.anoPublicacion = anoPublicacion;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }

        public String[] getTemas() {
            return temas;
        }

        public void setTemas(String[] temas) {
            this.temas = temas;
        }

        @Override
        public String toString() {
            return "ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor + ", Año: " + anoPublicacion +
                    ", Editorial: " + editorial + ", Páginas: " + numeroPaginas + ", Temas: " + Arrays.toString(temas);
        }
    }



