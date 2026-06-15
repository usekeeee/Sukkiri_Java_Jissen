package Chap8_quiz;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Gtihub_quiz {
    public static void main(String[] args) throws Exception {
        String url = "https://api.github.com/users/miyabilink";

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonText = response.body();

        System.out.println("---届いた生データ---");
        System.out.println(jsonText);

        System.out.println("\n--- 💡 Jacksonを使わずに文字の検索で解析 ---");

        int targetIndex = jsonText.indexOf("\"blog\":\"");

        if (targetIndex != -1) {
            int startIndex = targetIndex + 8;
            int endIndex = jsonText.indexOf("\"", startIndex);


            String blogUrl = jsonText.substring(startIndex, endIndex);

            System.out.println("miyabilinkさんのブログURLは: " + blogUrl);
        } else {
            System.out.println("blogのデータが見つかりませんでした。");
        }
    }
}