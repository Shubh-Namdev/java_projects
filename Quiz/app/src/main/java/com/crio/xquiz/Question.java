package com.crio.xquiz;
import java.util.*;

public class Question{
    private String questionText;
    private String answer;
    private List<String> choices;

    public Question(String questionText, List<String> choices, String answer) {
        if (questionText.equals("") || questionText.equals(null)) {
                System.out.println("Question text cannot be null or empty!");
        }else if (choices.isEmpty() || choices.equals(null)) {
                System.out.println("Choices cannot be null or empty!");
        }else if (answer.equals("") || answer.equals(null)) {
                System.out.println("Answer cannot be null or empty!");
        }else if (!isAnswerInList(choices, answer)) {
                System.out.println("Answer is not present among the choices!");
        }else {
                this.questionText = questionText;
                this.answer = answer;
                this.choices = choices;
        }
    }

    private boolean isAnswerInList(List<String> choices, String answer) {
        for (String choice : choices) {
                if (choice.equals(answer)) return true;
        }
        return false;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public List<String> getChoices() {
        return this.choices;
    }

    public boolean checkAnswer(String answer) {
        if (answer.equals(this.answer)) return true;
        else return false;
    }

    public void display(){
        System.out.println(getQuestionText());
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ":" + choices.get(i));
        }
    }

}

