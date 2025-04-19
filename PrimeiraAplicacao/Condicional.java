package PrimeiraAplicacao;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes esão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado para o cliente");
        } else {
            System.out.println("Cliente precisa assinar o plano");
        }
    }
}
