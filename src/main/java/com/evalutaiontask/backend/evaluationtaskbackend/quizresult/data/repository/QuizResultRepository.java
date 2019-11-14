package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.repository;


import com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.entity.QuizResultEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizResultRepository extends CrudRepository<QuizResultEntity, Long> {

    List<QuizResultEntity> findAllByName(String name);

}
