package com.example.demo.SuggestionController;

import com.example.demo.Service.GuestSuggestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SuggestionController {

    private GuestSuggestionService guestSuggestionService;

    public SuggestionController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    //works     -> Post: http://localhost:8080/api/suggestion?suggestion=sd
    //doesnt    -> Post: http://localhost:8080/api/suggestion?suggestion
    @PostMapping("/suggestion")
    public ResponseEntity<String> printAndProcessSuggestion(@RequestParam(required = false, defaultValue = "") String suggestion) {
        String response = guestSuggestionService.addSuggestion(suggestion);

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
