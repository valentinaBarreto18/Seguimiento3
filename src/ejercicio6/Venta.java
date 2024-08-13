package ejercicio6;

public class Venta {

        private Zapato zapato;
        private int talla;
        private int cantidad;
        private double valor;

        // Constructor
        public Venta(Zapato zapato, int talla, int cantidad) {
            this.zapato = zapato;
            this.talla = talla;
            this.cantidad = cantidad;
            this.valor = calcularTotal();
        }

        public double calcularTotal() {
            return zapato.getPrecio() * cantidad;
        }


        public void imprimirDetalle() {
            System.out.println("Zapato: " + zapato.getNombre());
            System.out.println("Talla: " + talla);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total: $" + valor);
        }

        @Override
        public String toString() {
        return zapato.getNombre() + " - Talla: " + talla + " - Cantidad: " + cantidad + " - Total: $" + valor;
    }
}


