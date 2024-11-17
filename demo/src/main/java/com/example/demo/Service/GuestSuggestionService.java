package com.example.demo.Service;

import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;

public class GuestSuggestionService {
    private final GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionService(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    SuggestionProcessor newSuggestions = new SuggestionProcessor();
}
