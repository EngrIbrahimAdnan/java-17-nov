package com.example.demo.Service;

//import com.example.demo.GuestSuggestionRepository.GuestSuggestionRepository;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionServiceImp implements GuestSuggestionService{
//    private GuestSuggestionRepository guestSuggestionRepository;

//    public GuestSuggestionServiceImp(GuestSuggestionRepository guestSuggestionRepository) {
//        this.guestSuggestionRepository = guestSuggestionRepository;
//    }


    public GuestSuggestionServiceImp() {
    }

    @Override
    public String addSuggestion(String newSuggestion){
        if (!newSuggestion.isEmpty()){
            String returnValue = "Saved suggestion\nSuggestion: " + newSuggestion;
            System.out.println(returnValue);
            return returnValue;
        }
        else{
            System.out.println("Incorrect param.");
            return null;
        }
    }
}
