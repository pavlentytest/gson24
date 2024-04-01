import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

// retrofit
        String www = "https://random.dog/woof.json";
        URL u = new URL(www);
        HttpsURLConnection connection;
        connection = (HttpsURLConnection) u.openConnection();
        connection.connect();

        Scanner scanner;
        Gson gson = new Gson();

        if(connection.getResponseCode() == 200) {
            scanner = new Scanner(connection.getInputStream());
            Answer answer = gson.fromJson(scanner.nextLine(),Answer.class);
            System.out.println(answer.url);
        }

        // GSON - Google SON





    }
}
class Answer {
    public String fileSizeBytes;
    public String url;
}
