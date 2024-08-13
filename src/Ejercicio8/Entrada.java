package Ejercicio8;

public class Entrada {
    private int numero;
    private String zona; // Puede ser GENERAL o VIP
    private double valor;
    private boolean vendida;
    private boolean ingresada;


    public Entrada(int numero, String zona, double valor) {
        this.numero = numero;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresada = false;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVendida() {
        return vendida;
    }

    public boolean isIngresada() {
        return ingresada;
    }


    public void marcarVendida() {
        if (!vendida) {
            vendida = true;
        } else {
            System.out.println("La entrada ya está vendida.");
        }
    }


        public void marcarIngresada() {
            if (vendida) {
                if (!ingresada) {
                    ingresada = true;
                } else {
                    System.out.println("La entrada ya ha sido ingresada.");
                }
            } else {
                System.out.println("La entrada no ha sido vendida.");
            }
        }

        @Override
        public String toString() {
            return "Número: " + numero + ", Zona: " + zona + ", Valor: " + valor + ", Vendida: " + vendida + ", Ingresada: " + ingresada;
        }
    }


