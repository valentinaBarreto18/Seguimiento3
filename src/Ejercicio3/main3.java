package Ejercicio3;

public class main3 {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0, true, "1234");


        System.out.println("\n--- Simulación de operaciones en cajero ---");


        System.out.println("1. Consultar saldo:");
        cuenta.consultarSaldo();


        System.out.println("\n2. Retirar $200:");
        cuenta.retirarEfectivo(200.0);


        System.out.println("\n3. Consignar $500:");
        cuenta.consignarEfectivo(500.0);


        System.out.println("\n4. Cambiar clave:");
        cuenta.cambiarClave("1234", "5678");


        System.out.println("\n5. Consultar saldo final:");
        cuenta.consultarSaldo();

        System.out.println("\nSimulación finalizada.");
    }
}
