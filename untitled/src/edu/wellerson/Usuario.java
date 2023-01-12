package edu.wellerson;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        extracted(smartTv);
    }

    private static void extracted(SmartTv smartTv) {
        System.out.println("A tv está ligada?" + smartTv.ligada);
    }
}
