package Ejercicio4;

public class Main4 {
    public static void main(String[] args) {
        Propiedad[] propiedades = new Propiedad[3];


        propiedades[0] = new Propiedad(1, "Calle 13 #123", 100.0, 150000.0, 3, 2, true, "Disponible");
        propiedades[1] = new Propiedad(2, "Avenida 19 #567", 120.0, 200000.0, 4, 3, true, "Vendida");
        propiedades[2] = new Propiedad(3, "Calle 15 #789", 90.0, 100000.0, 2, 1, false, "Disponible");


        System.out.println("Datos de las propiedades:");
        for (Propiedad propiedad : propiedades) {
            propiedad.mostrarDatos();
        }


        propiedades[0].setEstado("Vendida");


        System.out.println("Datos después de modificar el estado de la primera propiedad:");
        propiedades[0].mostrarDatos();
    }
}

