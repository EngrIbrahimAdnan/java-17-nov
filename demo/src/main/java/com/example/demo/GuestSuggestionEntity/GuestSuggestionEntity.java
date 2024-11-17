package com.example.demo.GuestSuggestionEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;

@Entity
public class GuestSuggestionEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="rate", nullable = false)
    private String rate;

    @Column(name="suggestion", nullable = false)
    private String suggestionText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }
}
