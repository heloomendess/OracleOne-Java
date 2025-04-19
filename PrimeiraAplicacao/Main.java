package PrimeiraAplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun - Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double notaMedia = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Média: " + notaMedia);

        String sinopse;
        sinopse = "O filme Top Gun: Maverick é uma sequência do clássico de 1986, onde o piloto Pete 'Maverick' Mitchell retorna para treinar uma nova geração de aviadores. Enfrentando desafios pessoais e profissionais, ele deve lidar com seu passado enquanto prepara os jovens pilotos para uma missão perigosa. Com ação intensa e emoção, o filme explora temas de coragem, amizade e superação.";
        System.out.println("Sinopse: " + sinopse);

        //Converter valores
        int classificacao = (int) (notaMedia /2);
        System.out.println("Classificação: " + classificacao);

    }
}
