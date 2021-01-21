package app.user.com.keo_18.domain;

import java.util.List;

public class Test {
    private int id;

    private String question;

    private List<String> answers;

    private String correctAnswer;

    public Test(int id, String question, List<String> answers, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAnswerCorrect(String answer) {
        return this.correctAnswer.equals(answer);
    }
}
