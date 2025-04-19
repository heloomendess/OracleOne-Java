package PrimeiraAplicacao;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito:");
        String nomeFilme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento do filme:");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite a sua nota para o filme:");
        double notaDoFilme = leitura.nextDouble();

        System.out.println("O seu filme favorito é: " + nomeFilme + ", foi lançado em " + anoLancamento + " e você deu a nota " + notaDoFilme + " para ele.");

    }
}
