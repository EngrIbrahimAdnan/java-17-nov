package com.example.demo.GuestSuggestionEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public class GuestSuggestionEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rate;
    private String suggestionText;
}
