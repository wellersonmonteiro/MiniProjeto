package edu.wellerson;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar () {
        ligada = true;

    }
    public void delisgar () {
        ligada = false;
    }
    public void aumentarValume () {
        volume ++;
    }
    public void diminuirVolume () {
        volume --;
    }
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

}
