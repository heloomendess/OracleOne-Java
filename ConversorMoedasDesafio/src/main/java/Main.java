
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] opcoes = {
            {"USD", "BRL"},
            {"EUR", "BRL"},
            {"GBP", "BRL"},
            {"JPY", "BRL"},
            {"BRL", "USD"},
            {"BRL", "EUR"}
        };

        System.out.println("=== CONVERSOR DE MOEDAS ===");

        for (int i = 0; i < opcoes.length; i++) {
            System.out.printf("%d. %s → %s%n", i + 1, opcoes[i][0], opcoes[i][1]);
        }

        System.out.print("Escolha uma opção (1-6): ");
        int escolha = sc.nextInt();

        if (escolha < 1 || escolha > 6) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.print("Digite o valor a converter: ");
        double valor = sc.nextDouble();

        String de = opcoes[escolha - 1][0];
        String para = opcoes[escolha - 1][1];

        try {
            String respostaJson = CurrencyAPI.getConversion(de, para, valor);
            double resultado = Conversor.extrairResultado(respostaJson);

            System.out.printf("Resultado: %.2f %s = %.2f %s%n", valor, de, resultado, para);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
