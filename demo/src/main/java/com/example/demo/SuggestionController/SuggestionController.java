package com.example.demo.SuggestionController;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionRepository.SuggestionProcessor;
import com.example.demo.Service.GuestSuggestionService;
import com.example.demo.bo.CreateSuggestionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SuggestionController {

    private GuestSuggestionService guestSuggestionService;

    public SuggestionController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }


    //Post: http://localhost:8080/api/suggestion
//    {
//        "suggestion":"olsen is here again", "rate":"This is a rate"
//    }

    @PostMapping("/suggestion")
    public ResponseEntity<String> printAndProcessSuggestion(@RequestBody(required = false)CreateSuggestionRequest newRequest) {
        SuggestionProcessor response = guestSuggestionService.addSuggestion(newRequest.getSuggestion(), newRequest.getRate());

        // Check if the response is not null (indicating a successful creation)
        if (response != null) {
            String message = "Successful addition";
            // Return a 201 Created status code along with the created user data
            return ResponseEntity.status(HttpStatus.CREATED).body(message);
        } else {
            // Handle the case where the creation was not successful (e.g., validation failed)
            // You can return a different status code or error message as needed

            String message = "Failed addition";
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
    }

    @GetMapping("/getall")
    public ResponseEntity<List<GuestSuggestionEntity>> getAll() {
        List<GuestSuggestionEntity> response = guestSuggestionService.findAll();

        // Check if the response is not null (indicating a successful creation)
        if (response != null) {

            // Return a 201 Created status code along with the created user data
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } else {
            // Handle the case where the creation was not successful (e.g., validation failed)
            // You can return a different status code or error message as needed

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }


}
