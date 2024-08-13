package Ejercicio8;

public class Concierto {
    private Entrada[] entradasGeneral;
    private Entrada[] entradasVIP;
    private int maxGeneral;
    private int maxVIP;


    public Concierto(int maxGeneral, int maxVIP, double valorGeneral, double valorVIP) {
        this.maxGeneral = maxGeneral;
        this.maxVIP = maxVIP;
        this.entradasGeneral = new Entrada[maxGeneral];
        this.entradasVIP = new Entrada[maxVIP];


        for (int i = 0; i < maxGeneral; i++) {
            entradasGeneral[i] = new Entrada(i + 1, "GENERAL", valorGeneral);
        }


        for (int i = 0; i < maxVIP; i++) {
            entradasVIP[i] = new Entrada(i + 1, "VIP", valorVIP);
        }
    }


    public int verificarDisponibilidad(String zona) {
        int disponibles = 0;
        if (zona.equalsIgnoreCase("GENERAL")) {
            for (Entrada e : entradasGeneral) {
                if (!e.isVendida()) {
                    disponibles++;
                }
            }
        } else if (zona.equalsIgnoreCase("VIP")) {
            for (Entrada e : entradasVIP) {
                if (!e.isVendida()) {
                    disponibles++;
                }
            }
        }
        return disponibles;
    }

    public void venderEntrada(String zona) {
        Entrada[] entradas = zona.equalsIgnoreCase("GENERAL") ? entradasGeneral : entradasVIP;
        for (Entrada e : entradas) {
            if (!e.isVendida()) {
                e.marcarVendida();
                System.out.println("Entrada vendida: " + e);
                return;
            }
        }
        System.out.println("No hay entradas disponibles en la zona " + zona);
    }


    public void registrarIngreso(int numero, String zona) {
        Entrada[] entradas = zona.equalsIgnoreCase("GENERAL") ? entradasGeneral : entradasVIP;
        for (Entrada e : entradas) {
            if (e.getNumero() == numero) {
                e.marcarIngresada();
                System.out.println("Ingreso registrado: " + e);
                return;
            }
        }
        System.out.println("Entrada no encontrada.");
    }
}



