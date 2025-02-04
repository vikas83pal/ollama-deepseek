package com.ollama.com.ollama_deepseek.controller;



import org.springframework.ai.chat.client.ChatClient;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    
    private ChatClient chatClient;

    public HomeController(ChatClient.Builder ChatClient){
        this.chatClient = ChatClient.build();
    }

    @GetMapping("/chat")
    public ResponseEntity<?> getChatResponse(@RequestParam("message") String message) {
        try {
            String response = chatClient.prompt(message).call().content();
            return ResponseEntity.ok(response);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

