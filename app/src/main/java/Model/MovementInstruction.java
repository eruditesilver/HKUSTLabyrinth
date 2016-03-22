package Model;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Silver on 15/3/2016.
 */
public class MovementInstruction {
    // the question
    public String questionString;
    // an instructions list to show
    private ArrayList<Instruction> instructions;
    // a correct instruction
    private Instruction correctInstruction;
    // some wrong instructions
    private ArrayList<Instruction> wrongInstructions;
    // model answer in string
    public String answerDetail;
    // model answer in image
    public Bitmap imageAnswerDetail;
    private int size;
    public MovementInstruction() {
        correctInstruction = new Instruction();
        wrongInstructions = new ArrayList<>();
        instructions = new ArrayList<>();
        this.size = GameConFig.MAX_NUMBER_OF_INSTRUCTION_TO_DISPLAY;
        init();
    }

    public void randomizeInstructions(){
        Collections.shuffle(wrongInstructions);
        instructions.clear();
        instructions.add(correctInstruction);
        for (int i = 1; i < size - 1; i++) {
            instructions.add(wrongInstructions.get(i));
        }
    }

    public boolean checkMovement(String movementString){
        if (movementString.equals(correctInstruction.instructionString)){
            return true;
        }
        return false;
    }

    public void getDetails(){
        //TODO get details information from storage
        // remarks: instruction in detail means statementInDetails and imageDetails exist.
    }

    public ArrayList<Instruction> getInstructionSet(){
        randomizeInstructions();
        return instructions;
    }

    private void init() {
        //TODO: get the instructions from instruction set in storage
        questionString = "";
        randomizeInstructions();
    }

}
