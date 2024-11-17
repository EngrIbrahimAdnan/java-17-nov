package com.example.demo.GuestSuggestionRepository;

public interface SuggestionProcessor {

    //store suggestions
    void suggestText(String suggestion, String rate);
}
