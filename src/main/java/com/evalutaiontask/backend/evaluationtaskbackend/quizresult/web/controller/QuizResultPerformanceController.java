package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.web.controller;

import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.QuizResultPerformanceService;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.QuizResultService;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResult;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResultPerformanceStats;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081", "http://localhost:8080", "https://backendquiz.herokuapp.com" })
public class QuizResultPerformanceController {
    private final QuizResultService quizResultService;
    private QuizResultPerformanceService quizResultPerformanceService;

    @GetMapping(path = "/quizresult-performance")
    public QuizResultPerformanceStats getPerformance() {
        List<QuizResult> quizResults = quizResultService.findAll();

        return quizResultPerformanceService.calculateStats(quizResults);
    }
}
