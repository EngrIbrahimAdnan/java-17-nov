package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;

public interface GuestSuggestionService {
    GuestSuggestionEntity addSuggestion(String newSuggestion, String rate);
}
