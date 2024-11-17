package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestSuggestionServiceImp implements GuestSuggestionService{
    private final GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionServiceImp(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    @Override
    public GuestSuggestionEntity addSuggestion(String newSuggestion, String rate){
        if (!newSuggestion.isEmpty()){

            GuestSuggestionEntity guestSuggestionEntity = new GuestSuggestionEntity();
            guestSuggestionEntity.setSuggestionText(newSuggestion);
            guestSuggestionEntity.setRate(rate);

            guestSuggestionEntity = guestSuggestionRepository.save(guestSuggestionEntity);

            return guestSuggestionEntity;
        }
        else{
            System.out.println("Incorrect param.");
            return null;
        }
    }

    @Override
    public List<GuestSuggestionEntity> findAll(){
        return guestSuggestionRepository.findAll();
    }
}
