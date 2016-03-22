package Views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Model.GameConFig;
import Model.Instruction;
import Model.MovementInstruction;

/**
 * Created by sfwongac on 3/22/2016.
 */
public class MotionInstructionView extends LinearLayout {
    private MovementInstruction movementInstruction;
    private TextView questionView;
    private ArrayList<TextView> answerViews;
    public MotionInstructionView(Context context) {
        super(context);
        movementInstruction = new MovementInstruction();
        answerViews = new ArrayList<>();
        setupViews(context);
        updateViewText();
    }

    private void updateViewText() {
        questionView.setText(movementInstruction.questionString);
        for (int i = 0; i < movementInstruction.getInstructionSet().size(); i++) {
            answerViews.get(i).setText(movementInstruction.getInstructionSet().get(i).instructionString);
        }
    }

    private void setupViews(Context context) {
        questionView = new TextView(context);
        addView(questionView);
        for (int i = 0; i < GameConFig.MAX_NUMBER_OF_INSTRUCTION_TO_DISPLAY; i++) {
            TextView tv = new TextView(context);
            answerViews.add(tv);
        }
    }
}
