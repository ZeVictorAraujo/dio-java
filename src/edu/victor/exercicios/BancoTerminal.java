package edu.victor.exercicios;
public class BancoTerminal {

    public static void main(String[] args) {
        double saldo = 15;
        double valor_solicitado = 18;

        if(saldo > valor_solicitado){
            saldo = saldo - valor_solicitado;
            System.out.println("Saldo atualizado: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
