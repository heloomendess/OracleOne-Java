package PrimeiraAplicacao;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaNota = 0;
        double somaNota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme:");
            somaNota = leitura.nextDouble();
            mediaNota += somaNota;
        }

        System.out.println("Media de avaliação: " + mediaNota / 3);
    }
}
