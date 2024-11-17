package com.example.demo.bo;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionEntity.SuggestionStatus;

//fields for request
public class CreateSuggestionRequest {

    private String suggestion;
    private String rate;
    private SuggestionStatus suggestionStatus;

    public CreateSuggestionRequest(String suggestion, String rate, SuggestionStatus suggestionStatus) {
        this.suggestion = suggestion;
        this.rate = rate;
        this.suggestionStatus = suggestionStatus;

    }

    public SuggestionStatus getSuggestionStatus() {
        return suggestionStatus;
    }

    public void setSuggestionStatus(SuggestionStatus suggestionStatus) {
        this.suggestionStatus = suggestionStatus;
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
