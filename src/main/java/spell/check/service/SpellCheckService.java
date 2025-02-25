package spell.check.service;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SpellCheckService {

    public String checkWord(String word) {
        String urlStr = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
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
