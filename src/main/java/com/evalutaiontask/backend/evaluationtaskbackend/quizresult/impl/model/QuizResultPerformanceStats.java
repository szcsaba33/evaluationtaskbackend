package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuizResultPerformanceStats {
    private final float minNumCorrect;
    private final float averageNumCorrect;
    private final float averageNumTotal;
}
