package com.example.demo.bo;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;

//fields for request
public class CreateSuggestionRequest {

    private String suggestion;
    private String rate;

    public CreateSuggestionRequest(String suggestion, String rate) {
        this.suggestion = suggestion;
        this.rate = rate;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
