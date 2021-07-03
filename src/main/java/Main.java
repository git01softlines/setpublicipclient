import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        do {
            try {
                var client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://41.226.32.58:8096/setip"))
                        .build();
                var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
                Thread.sleep(300000);
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);

        // create a client

    }


}
