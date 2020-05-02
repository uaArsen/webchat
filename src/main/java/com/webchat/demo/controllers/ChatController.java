package com.webchat.demo.controllers;

import com.webchat.demo.dto.FrontendMessage;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ChatController {

    @GetMapping("/chats")
    public List<String> getChatsForUsers(final Principal principal) {
        principal.getName();
        return new ArrayList<>();
    }

    @GetMapping("/chats/{id}")
    public List<String> getChat(final Principal principal,
                                final @PathVariable long id) {
        principal.getName();
        return new ArrayList<>();
    }

    @GetMapping("/chats/{id}")
    public List<String> getMessages(final Principal principal,
                                    final @PathVariable long id,
                                    final @RequestParam(required = false, defaultValue = "0") int start,
                                    final @RequestParam(required = false,  defaultValue = "50") int top) {
        principal.getName();
        return new ArrayList<>();
    }

    @PostMapping("/chats/{id}")
    public List<String> sendMessage(final Principal principal,
                                    final @PathVariable long id,
                                    @RequestBody FrontendMessage message) {
        principal.getName();
        return new ArrayList<>();
    }
}
