package DesafioContaBancaria;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Heloisa Mendes";
        String tipoConta = "Corrente";
        double saldo = 1435.00;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************************");

        String menu = """
                *Digite sua opção: 
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor a ser transferido?");
                double valorTransferido = leitura.nextDouble();

                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada com sucesso! Seu novo saldo é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Valor recebido com sucesso! Seu novo saldo é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Tente novamente.");
            } else {
                System.out.println("Saindo do sistema...");
            }
        }
    }
}
