package Ejercicio3;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private String clave;


    public CuentaBancaria(String numeroCuenta, double saldoInicial, boolean estadoInicial, String claveInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.estado = estadoInicial;
        this.clave = claveInicial;
    }


    public void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }


    public void retirarEfectivo(double valor) {
        if (estado) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }


    public void consignarEfectivo(double valor) {
        if (estado) {
            saldo += valor;
            System.out.println("Consignación exitosa. Su nuevo saldo es: $" + saldo);
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }
    public void cambiarClave(String claveActual, String nuevaClave) {
        if (claveActual.equals(clave)) {
            clave = nuevaClave;
            System.out.println("Clave cambiada con éxito.");
        } else {
            System.out.println("Clave incorrecta.");
        }
    }
    }

