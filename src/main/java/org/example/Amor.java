package org.example;

public class Amor {

    public static void main(String[] args) throws InterruptedException {
        String nombre1 = "Fabian";
        String nombre2 = "Yeraldin";
        String mensaje = "TE AMO 💖";

        System.out.println("╔════════════════════════════╗");
        System.out.println("   Historia de amor en Java  ");
        System.out.println("╚════════════════════════════╝");
        Thread.sleep(1000);

        System.out.println("\nConectando...");
        Thread.sleep(800);
        System.out.println(nombre1 + " ❤️ " + nombre2);
        Thread.sleep(1200);

        System.out.println("\nProcesando sentimientos...");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }

        // Mostrar mensaje final con "animación"
        System.out.println("\n\nResultado final: ");
        for (char c : mensaje.toCharArray()) {
            System.out.print("\u001B[35m" + c + "\u001B[0m"); // Texto color magenta
            Thread.sleep(300);
        }

        System.out.println("\n\n💌 De " + nombre1 + " para " + nombre2 + " 💌");
    }
}
