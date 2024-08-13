package ejercicio6;

public class Main6 {

    public static void main(String[] args) {

                Zapato[] modelosZapatos = new Zapato[5];
                modelosZapatos[0] = new Zapato("Modelo A", "Cuero", "Negro", 100.0, "Invierno");
                modelosZapatos[1] = new Zapato("Modelo B", "Cuero", "Marrón", 110.0, "casual");
                modelosZapatos[2] = new Zapato("Modelo C", "Gamuza", "Azul", 120.0, "Verano");
                modelosZapatos[3] = new Zapato("Modelo D", "Sintético", "Gris", 90.0, "Sports");
                modelosZapatos[4] = new Zapato("Modelo E", "Textil", "Blanco", 80.0, "Primavera");


                Inventario[] inventarios = new Inventario[5];
                for (int i = 0; i < modelosZapatos.length; i++) {
                    inventarios[i] = new Inventario(modelosZapatos[i], 3);
                    inventarios[i].registrarEntrada(40, 10);
                    inventarios[i].registrarEntrada(41, 8);
                    inventarios[i].registrarEntrada(42, 15);
                }


                Venta venta1 = new Venta(modelosZapatos[0], 40, 2);
                inventarios[0].registrarSalida(40, 2);

                Venta venta2 = new Venta(modelosZapatos[1], 42, 3);
                inventarios[1].registrarSalida(42, 3);

                Venta venta3 = new Venta(modelosZapatos[2], 41, 1);
                inventarios[2].registrarSalida(41, 1);


                System.out.println("Inventario Actual:");
                for (Inventario inventario : inventarios) {
                    System.out.println(inventario);
                }


                System.out.println("\nVentas Realizadas:");
                System.out.println(venta1);
                System.out.println(venta2);
                System.out.println(venta3);
            }
        }


