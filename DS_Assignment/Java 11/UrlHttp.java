import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UrlHttp {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create("http://httpbin.org/get"))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Void> response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        HttpHeaders headers = response.headers();
        		
        		
        headers.map().forEach((key, values) -> {
            System.out.printf("%s: %s%n", key, values);

            //System.out.println(response.statusCode());
            //System.out.println(response.body());
            
        
        });
    }
}