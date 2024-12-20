package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionEntity.SuggestionStatus;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;

import java.util.List;

public interface GuestSuggestionService {
    SuggestionProcessor addSuggestion(String newSuggestion, String rate, SuggestionStatus suggestionStatus);

    List<GuestSuggestionEntity> findAll();

    List<GuestSuggestionEntity> getOnlyCreate();
    List<GuestSuggestionEntity> getOnlyRemove();

}
