package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Silver on 15/3/2016.
 */
public class MovementInstruction {
    private ArrayList<Instruction> instructions;
    private ArrayList<Instruction> correctInstructions;
    private ArrayList<Instruction> wrongInstructions;
    private int size;
    public MovementInstruction(int size) {
        correctInstructions = new ArrayList<>();
        wrongInstructions = new ArrayList<>();
        instructions = new ArrayList<>();
        this.size = size;
        init();
    }

    public void randomizeInstructions(){
        Collections.shuffle(correctInstructions);
        Collections.shuffle(wrongInstructions);
        instructions.clear();
        instructions.add(correctInstructions.get(0));
        for (int i = 1; i < size - 1; i++) {
            instructions.add(wrongInstructions.get(i));
        }
    }

    private void init() {
        //TODO: get the instructions from instruction set in storage

        randomizeInstructions();
    }

}
