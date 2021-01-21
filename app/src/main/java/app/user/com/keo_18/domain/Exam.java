package app.user.com.keo_18.domain;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Exam implements Iterator<Test> {
    private LinkedHashMap<Integer, Test> tests;

    private Iterator<Test> iterator;

    private Test currentTest;

    private int score;

    public Exam(LinkedHashMap<Integer, Test> tests) {
        this.tests = tests;

        this.reset();
    }

    public LinkedHashMap<Integer, Test> getTests() {
        return tests;
    }

    public void setTests(LinkedHashMap<Integer, Test> tests) {
        this.tests = tests;
    }

    public int getScore() {
        return score;
    }

    public void giveTestAnswer(String answer) {
        Test test = this.tests.get(this.currentTest.getId());
        if (test == null) {
            return;
        }

        if (test.isAnswerCorrect(answer)) {
            this.score++;
        }
    }

    public Test GetCurrentTest() {
        return this.currentTest;
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Test next() {
        this.currentTest = this.iterator.next();
        return this.currentTest;
    }

    @Override
    public void remove() {

    }

    public void reset() {
        this.score = 0;
        this.iterator = this.getTests().values().iterator();
    }
}
