package ejercicio6;

public class Inventario {

        private Zapato zapato;
        private int[] stockPorTalla;


        public Inventario(Zapato zapato, int tallasDisponibles) {
            this.zapato = zapato;
            this.stockPorTalla = new int[tallasDisponibles];
        }

        public void registrarEntrada(int talla, int cantidad) {
            int indice = talla - 40;
            if (indice >= 0 && indice < stockPorTalla.length) {
                stockPorTalla[indice] += cantidad;
            } else {
                System.out.println("Talla fuera de rango");
            }
        }


        public void registrarSalida(int talla, int cantidad) {
            int indice = talla - 40; //
            if (indice >= 0 && indice < stockPorTalla.length) {
                if (stockPorTalla[indice] >= cantidad) {
                    stockPorTalla[indice] -= cantidad;
                } else {
                    System.out.println("No hay suficiente stock para la talla " + talla);
                }
            } else {
                System.out.println("Talla fuera de rango");
            }
        }


        public int consultarStock(int talla) {
            int indice = talla - 40; //
            if (indice >= 0 && indice < stockPorTalla.length) {
                return stockPorTalla[indice];
            } else {
                System.out.println("Talla fuera de rango");
                return 0;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(zapato.toString()).append(" - Stock por Talla: ");
            for (int i = 0; i < stockPorTalla.length; i++) {
                sb.append("Talla ").append(40 + i).append(": ").append(stockPorTalla[i]).append(" ");
            }
            return sb.toString();
        }
    }


