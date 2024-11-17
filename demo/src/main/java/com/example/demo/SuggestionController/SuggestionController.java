package com.example.demo.SuggestionController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SuggestionController {

    @PostMapping("/suggestion")
    public String printAndProcessSuggestion(@RequestParam(required = false, defaultValue = "") String suggestion) {
        String returnValue = "Saved suggestion\nSuggestion: " + suggestion;
        System.out.println(returnValue);

        return returnValue;
    }
}
