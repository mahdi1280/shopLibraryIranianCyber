package ir.iraniancyber.taghcheiraniancyber.dto;

import java.io.Serializable;

public class MessageDto implements Serializable {

    private String message;

    public MessageDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
