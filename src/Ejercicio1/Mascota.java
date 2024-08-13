package Ejercicio1;

public class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String color;

    public Mascota(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println();
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class main1 {
        public static void main(String[] args) {
            Mascota mascota1 = new Mascota("lucas", 3, "pastor Aleman", "negro");
            Mascota mascota2 = new Mascota("Beethoven", 5, " san bernando", "blanco con negro");
            Mascota mascota3 = new Mascota("lucas", 4, "labrador", "cenizo");

            System.out.println("detalles de las mascotas:");
            mascota1.imprimirDetalles();
            mascota2.imprimirDetalles();
            mascota3.imprimirDetalles();
            mascota1.setEdad(6);
            mascota1.setColor("blanco");
            System.out.println("detalles de la mascota 1 despues de la modificacion");
            mascota1.imprimirDetalles();
        }


        }
}