package spell.check.ch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spell.check.ch.service.Spell_Check_serv;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Spell_Check {

    @Autowired
    private Spell_Check_serv spellCheckServ;

    @GetMapping("/check")
    public Map<String, Object> checkWord(@RequestParam String word) {
        Map<String, Object> res = new HashMap<>();
        res.put("word", word);
        res.put("status", spellCheckServ.checkWord(word));
        return res;
    }
}
