package com.evalutaiontask.backend.evaluationtaskbackend.quizresult.impl.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class QuizResult {
    private final String name;
    private final float numCorrect;
    private final float numTotal;

    public QuizResult(String name, float numCorrect, float numTotal) {
        this.name = name;
        this.numCorrect = numCorrect;
        this.numTotal = numTotal;
    }

    public String getName() {
        return name;
    }

    public float getNumCorrect() {
        return numCorrect;
    }

    public float getNumTotal() {
        return numTotal;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        QuizResult that = (QuizResult) o;

        return new EqualsBuilder()
                .append(numTotal, that.numTotal)
                .append(numCorrect, that.numCorrect)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(numCorrect)
                .append(numTotal)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("numCorrect", numCorrect)
                .append("numTotal", numCorrect)
                .toString();
    }
}
