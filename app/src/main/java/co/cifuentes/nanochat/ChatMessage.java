package co.cifuentes.nanochat;

/**
 * Created by dcifuen on 10/08/15.
 */
public class ChatMessage {
    private String name;
    private String message;

    public ChatMessage() {
        // necessary for Firebase's deserializer
    }

    public ChatMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

}
