package com.example.demo.GuestSuggestionRepository;

import com.example.demo.GuestSuggestionEntity.GuestSuggestionEntity;
import com.example.demo.GuestSuggestionEntity.SuggestionStatus;
import com.example.demo.bo.CreateSuggestionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
    List<GuestSuggestionEntity> findByStatus(SuggestionStatus suggestionStatus);

}


