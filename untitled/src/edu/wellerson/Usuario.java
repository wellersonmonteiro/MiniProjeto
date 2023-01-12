package edu.wellerson;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume? " + smartTv.volume);
        System.out.println("Qual o canal? " + smartTv.canal);
        smartTv.ligar();
        System.out.println("Novo status: " + smartTv.ligada);
        smartTv.delisgar();
        System.out.println("Novo status: " + smartTv.ligada);
        smartTv.aumentarValume();
        System.out.println("O novo volume é " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("O novo volume é " + smartTv.volume);

    }
}
