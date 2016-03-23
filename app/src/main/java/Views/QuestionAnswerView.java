package Views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

import Model.GameConFig;
import Model.Movement;
import Model.QuestionAnswerSet;

/**
 * Created by sfwongac on 3/22/2016.
 */
public class QuestionAnswerView extends LinearLayout {
    private QuestionAnswerSet questionAnswerSet;
    private TextView questionView;
    ArrayList<String> answers;
    private Context context;

    public QuestionAnswerView(Context context) {
        super(context);
        this.context = context;
        updateViews();
    }

    public void nextQuestion() {
        updateViews();
    }

    public boolean checkAnswer(Movement movement) {
       if (movement == questionAnswerSet.getCorrectAnswer().movement){
           return true;
       }
        return false;
    }

    private void updateViews() {
        removeAllViews();

        // display the question
        questionAnswerSet = new QuestionAnswerSet();
        questionView = new TextView(context);
        questionView.setText(questionAnswerSet.getQuestionString());
        addView(questionView);

        answers = new ArrayList<>(questionAnswerSet.getWrongAnswers());
        answers.add(questionAnswerSet.getCorrectAnswer().answer);
        Collections.shuffle(answers);
        for (int i = 0; i < answers.size(); i++) {
            TextView tv = new TextView(context);
            tv.setText(answers.get(i));
            addView(tv);
        }
    }
}
