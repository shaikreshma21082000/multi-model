package com.spring.multi_model.service;


import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MultiModelService {

    private final ChatClient openAiChatClient;
    private final ChatClient ollamaChatClient;

    public String getResponseFromOpenAi(String prompt) {
        return openAiChatClient.prompt(prompt)
                .call()
                .content();
    }

    public String getResponseFromOllama(String prompt) {
        return ollamaChatClient.prompt(prompt)
                .call()
                .content();
    }
}
