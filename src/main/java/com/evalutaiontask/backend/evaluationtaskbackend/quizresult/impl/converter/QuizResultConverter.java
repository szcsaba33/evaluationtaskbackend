package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.converter;

import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.entity.QuizResultEntity;
import org.springframework.stereotype.Component;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResult;


@Component
public class QuizResultConverter {
    public QuizResult fromEntity(QuizResultEntity entity) {
        return new QuizResult(
                entity.getName(),
                entity.getNumCorrect(),
                entity.getNumTotal()
        );
    }

    public QuizResultEntity toEntity(QuizResult quizResult) {
        return new QuizResultEntity(
                0,
                quizResult.getName(),
                quizResult.getNumCorrect(),
                quizResult.getNumTotal()
        );
    }
}
