package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl;


import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.entity.QuizResultEntity;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.repository.QuizResultRepository;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.converter.QuizResultConverter;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResult;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081" })
public class QuizResultService {
    private final QuizResultRepository repository;
    private final QuizResultConverter converter;

    public List<QuizResult> findAll() {
        return Lists.newLinkedList(repository.findAll()).stream()
                .map(converter::fromEntity)
                .collect(Collectors.toList());
    }

    public List<QuizResult> findAllByName(String name) {
        return Lists.newLinkedList(repository.findAllByName(name)).stream()
                .map(converter::fromEntity)
                .collect(Collectors.toList());
    }

    public QuizResult save(QuizResult quizResult) {
        QuizResultEntity entity = converter.toEntity(quizResult);
        entity = repository.save(entity);
        return converter.fromEntity(entity);
    }
}
