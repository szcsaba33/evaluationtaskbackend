package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl;


import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResult;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResultPerformanceStats;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuizResultPerformanceService {
    public QuizResultPerformanceStats calculateStats(List<QuizResult> quizResults) {
        return QuizResultPerformanceStats.builder()
                .minNumCorrect(getMinNumCorrect(quizResults))
                .maxNumCorrect(getMaxNumCorrect(quizResults))
                .averageNumCorrect(getAverageNumCorrect(quizResults))
                .averageNumTotal(getAverageNumTotal(quizResults))
                .build();
    }

    private float getAverageNumCorrect(List<QuizResult> quizResults) {
        return (float) quizResults.stream()
                .mapToDouble(QuizResult::getNumCorrect)
                .average()
                .orElse(0.0);
    }

    private float getAverageNumTotal(List<QuizResult> quizResults) {
        return (float) quizResults.stream()
                .mapToDouble(QuizResult::getNumTotal)
                .average()
                .orElse(0.0);
    }

    private float getMinNumCorrect(List<QuizResult> quizResults) {
        return (float) quizResults.stream()
                .mapToDouble(QuizResult::getNumCorrect)
                .min()
                .orElse(0.0);
    }

    private float getMaxNumCorrect(List<QuizResult> quizResults) {
        return (float) quizResults.stream()
                .mapToDouble(QuizResult::getNumCorrect)
                .max()
                .orElse(0.0);
    }


}
