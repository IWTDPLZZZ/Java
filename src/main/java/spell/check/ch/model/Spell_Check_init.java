package spell.check.ch.model;

public class Spell_Check_init {

    private String word;
    private String status;
    private String error;
    private String apiMessage;

    public Spell_Check_init() {}

    public void init(String word, String status, String error, String apiMessage) {
        this.word = word;
        this.status = status;
        this.error = error;
        this.apiMessage = apiMessage;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getApiMessage() {
        return apiMessage;
    }

    public void setApiMessage(String apiMessage) {
        this.apiMessage = apiMessage;
    }
}
