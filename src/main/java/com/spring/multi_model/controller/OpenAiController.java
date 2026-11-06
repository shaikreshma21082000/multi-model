package com.spring.multi_model.controller;


import com.spring.multi_model.service.MultiModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class OpenAiController {

    private final MultiModelService multiModelService;

    @PostMapping("/openai-ask")
    public String getDataFromOpenAi(@RequestParam String prompt){
        return multiModelService.getResponseFromOpenAi(prompt);
    }

    @PostMapping("/ollama-ask")
    public String getDataFromOllama(@RequestParam String prompt){
        return multiModelService.getResponseFromOllama(prompt);
    }
}
