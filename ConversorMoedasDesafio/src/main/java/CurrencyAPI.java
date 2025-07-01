import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyAPI {
    public static String getConversion(String from, String to, double amount) throws Exception {
        String url = String.format(
                "https://api.exchangerate.host/convert?from=%s&to=%s&amount=%s",
                from, to, String.format(java.util.Locale.US, "%.2f", amount)
        );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
