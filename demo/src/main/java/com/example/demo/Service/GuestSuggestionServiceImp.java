package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestSuggestionServiceImp implements GuestSuggestionService {
    private final GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionServiceImp(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    @Override
    public SuggestionProcessor addSuggestion(String newSuggestion, String rate) {
        if (!newSuggestion.isEmpty()) {

            SuggestionProcessor suggestionProcessor = (lambdaSuggestion, lambdaRate) -> {
                GuestSuggestionEntity guestSuggestionEntity = new GuestSuggestionEntity();
                guestSuggestionEntity.setSuggestionText(lambdaSuggestion);
                guestSuggestionEntity.setRate(lambdaRate);

                guestSuggestionEntity = guestSuggestionRepository.save(guestSuggestionEntity);

            };

            suggestionProcessor.suggestText(newSuggestion,rate);

            return suggestionProcessor;
        } else {
            System.out.println("Incorrect param.");
            return null;
        }
    }

    @Override
    public List<GuestSuggestionEntity> findAll() {
        return guestSuggestionRepository.findAll();
    }
}
