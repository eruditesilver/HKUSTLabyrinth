package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sfwongac on 3/23/2016.
 */
public class QuestionAnswerSet {
    private String questionString;
    private MovementAnswer correctAnswer;
    private ArrayList<MovementAnswer> wrongAnswers;

    public QuestionAnswerSet() {
        init();
    }

    public String getQuestionString() {
        return questionString;
    }

    public MovementAnswer getCorrectAnswer() {
        return correctAnswer;
    }

    public ArrayList<String> getWrongAnswers() {
        Collections.shuffle(wrongAnswers);
        ArrayList<String> wrongAnswersToDisplay = new ArrayList<>();
        for (int i = 0; i < GameConFig.MAX_NUMBER_OF_ANSWERS_TO_DISPLAY - 1; i++) {
            wrongAnswersToDisplay.add(wrongAnswers.get(i).answer);
        }
        return wrongAnswersToDisplay;
    }

    private void init() {
        //TODO: read from files
        questionString = "";
        correctAnswer.answer = "";
        wrongAnswers = new ArrayList<>();

    }
}
