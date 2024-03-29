package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.web.controller;

import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.QuizResultService;
import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model.QuizResult;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081", "http://localhost:8080", "https://backendquiz.herokuapp.com", "https://evaluationtask.herokuapp.com" })
public class QuizResultController {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuizResultController.class);

    private final QuizResultService service;

    @GetMapping(path = "/quizresult")
    @CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081", "http://localhost:8080", "https://backendquiz.herokuapp.com", "https://evaluationtask.herokuapp.com" })
    public List<QuizResult> getAllQuizResults() {
        return service.findAll();
    }

    @GetMapping(path = "/quizresult/name/{name}")
    @CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081", "http://localhost:8080", "https://backendquiz.herokuapp.com" })
    public List<QuizResult> getQuizResultsByName(@PathVariable String name) {
        return service.findAllByName(name);
    }

    @PostMapping(path = "/quizresult")
    @CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8081", "http://localhost:8080", "https://backendquiz.herokuapp.com", "https://evaluationtask.herokuapp.com" })
    public QuizResult createQuizResults(@RequestBody QuizResult quizResult) {
        LOGGER.info("Saving quizresult={}", quizResult);

        return service.save(quizResult);
    }
}
