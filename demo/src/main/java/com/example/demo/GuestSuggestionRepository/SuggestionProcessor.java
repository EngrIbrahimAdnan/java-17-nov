package com.example.demo.GuestSuggestionRepository;

import com.example.demo.GuestSuggestionEntity.SuggestionStatus;

public interface SuggestionProcessor {

    //store suggestions
    void suggestText(String suggestion, String rate, SuggestionStatus suggestionStatus);
}
