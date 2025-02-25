package spellcheck.service;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SpellCheckService {

    public String checkWord(String word) {
        String urlString = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                return "Корректно";
            } else {
                return "Ошибка";
            }
        } catch (IOException e) {
            return "Ошибка при запросе к API: " + e.getMessage();
        }
    }
}
