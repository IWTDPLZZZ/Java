package spell.check.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spell.check.service.SpellCheckService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SpellCheckController {

    @Autowired
    private SpellCheckService spellCheckService;

    @GetMapping("/check")
    public Map<String, Object> checkWord(@RequestParam String word) {
        Map<String, Object> response = new HashMap<>();
        response.put("word", word);
        response.put("status", spellCheckService.checkWord(word));
        return response;
    }
}
