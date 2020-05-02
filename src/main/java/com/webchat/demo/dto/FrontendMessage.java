package com.webchat.demo.dto;

import java.util.Objects;

public class FrontendMessage {

    private final String message;

    public FrontendMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "FrontendMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
