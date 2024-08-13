package Ejercicio8;

public class main8 {
        public static void main(String[] args) {

            Concierto concierto = new Concierto(10, 5, 50.0, 100.0);


            System.out.println("Disponibilidad GENERAL: " + concierto.verificarDisponibilidad("GENERAL"));
            System.out.println("Disponibilidad VIP: " + concierto.verificarDisponibilidad("VIP"));


            concierto.venderEntrada("GENERAL");
            concierto.venderEntrada("VIP");


            for (int i = 0; i < 12; i++) {
                concierto.venderEntrada("GENERAL");
            }

            concierto.registrarIngreso(1, "GENERAL");
            concierto.registrarIngreso(2, "VIP");


            concierto.registrarIngreso(10, "GENERAL");
        }
    }


