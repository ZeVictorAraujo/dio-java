package edu.victor.desafio.ContaBanco;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroConta = 10000000 + random.nextInt(90000000);
        int saldo = 10000;

                System.out.println("""
                Seja bem vindo ao Banco America.
                Informe os seguintes dados:\s
                """);

        System.out.print("Agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.print("\nSeu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
