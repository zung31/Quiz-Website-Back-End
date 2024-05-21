package com.projectspring.quizonline.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Question is mandatory")
    private String question;
    @NotBlank(message = "Subject is mandatory")
    private String subject;
    @NotBlank(message = "Question type is mandatory")
    private String questionType;

    @NotBlank(message = "Choices are mandatory")
    @ElementCollection
    private List<String> choices;

    @NotBlank(message = "Correct answers are mandatory")
    @ElementCollection
    private List<String> correctAnswers;
}
