package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.data.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuizResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private float numCorrect;
    private float numTotal;

    public QuizResultEntity() {
    }

    public QuizResultEntity(long id, String name, float numCorrect, float numTotal) {
        this.id = id;
        this.name = name;
        this.numCorrect = numCorrect;
        this.numTotal = numTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(float numCorrect) {
        this.numCorrect = numCorrect;
    }

    public float getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(float numCorrect) {
        this.numTotal = numTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        QuizResultEntity that = (QuizResultEntity) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(numCorrect, that.numCorrect)
                .append(name, that.name)
                .append(numTotal, that.numTotal)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(numCorrect)
                .append(numTotal)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("numCorrect", numCorrect)
                .append("numTotal", numTotal)
                .toString();
    }
}
