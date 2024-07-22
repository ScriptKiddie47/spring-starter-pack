import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HealthCheck {
    public static void main(String[] args) {
        String httpEndpoint = "https://reqre.in/api/users/2";
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI(httpEndpoint))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newBuilder()
                    .build();
            HttpResponse<String> httpResponse = client.send(httpRequest, BodyHandlers.ofString());
            System.out.println("Status: " + httpResponse.statusCode());
            System.out.println("Response: " + httpResponse.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// String filename = "D:\\certs_path\\cacerts"; // cerrtification file path
// System.setProperty("javax.net.ssl.trustStore", fileName);