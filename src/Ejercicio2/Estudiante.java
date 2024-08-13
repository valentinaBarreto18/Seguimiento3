package Ejercicio2;

public class Estudiante{
    private String nombres;
    private String apellidos;
    private int grado;
    private int edad;
    private double promedioAcademico;
    private String nombreMadre;
    private String nombrePadre;
    private String telefono1;
    private String telefono2;


    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.telefono1 = null;
        this.telefono2 = null;
    }


    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre, String telefono1) {
        this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
        this.telefono1 = telefono1;
    }


    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre, String telefono1, String telefono2) {
        this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }


    public void imprimirDatos() {
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Grado: " + grado);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio Académico: " + promedioAcademico);
        System.out.println("Nombre de la Madre: " + nombreMadre);
        System.out.println("Nombre del Padre: " + nombrePadre);
        if (telefono1 != null) {
            System.out.println("Teléfono 1: " + telefono1);
        }
        if (telefono2 != null) {
            System.out.println("Teléfono 2: " + telefono2);
        }
        System.out.println();
    }
}




