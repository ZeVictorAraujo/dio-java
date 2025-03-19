package edu.victor.exercicios.smartTV;

public class smartTv {
        boolean ligado = false;
        int canal = 0;
        int volume = 0;

        public void ligar() {
            ligado = true;
        }

        public void desligar() {
            ligado = false;
        }

        public void aumentarCanal() {
            canal++;
        }

        public void diminuirCanal() {
            canal--;
        }

        public void aumentarVolume() {
            volume++;
        }

        public void diminuirVolume() {
            volume--;
        }
}