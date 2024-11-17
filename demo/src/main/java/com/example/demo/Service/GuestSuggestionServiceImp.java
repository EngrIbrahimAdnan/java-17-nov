package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionEntity.SuggestionStatus;
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
    public SuggestionProcessor addSuggestion(String newSuggestion, String rate, SuggestionStatus suggestionStatus) {
        if (!newSuggestion.isEmpty()) {

            SuggestionProcessor suggestionProcessor = (lambdaSuggestion, lambdaRate, lambdaStatus) -> {
                GuestSuggestionEntity guestSuggestionEntity = new GuestSuggestionEntity();
                guestSuggestionEntity.setSuggestionText(lambdaSuggestion);
                guestSuggestionEntity.setRate(lambdaRate);
                guestSuggestionEntity.setStatus(lambdaStatus);

                guestSuggestionRepository.save(guestSuggestionEntity);

            };

            suggestionProcessor.suggestText(newSuggestion,rate, suggestionStatus);
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

    @Override
    public List<GuestSuggestionEntity> getOnlyCreate(){
        return guestSuggestionRepository.findByStatus(SuggestionStatus.CREATE);
    }

    @Override
    public List<GuestSuggestionEntity> getOnlyRemove(){
        return guestSuggestionRepository.findByStatus(SuggestionStatus.REMOVE);
    }
//    List<GuestSuggestionEntity> getOnlyRemove();

}


