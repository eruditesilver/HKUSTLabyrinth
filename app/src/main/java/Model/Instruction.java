package Model;

import android.graphics.Bitmap;

/**
 * Created by Silver on 15/3/2016.
 */
public class Instruction {
    public String statement;
    public Movement movement;
    public String statementInDetails;
    public Bitmap imageDetails;
    public void getDetails(){
        //TODO get details information from storage
        // remarks: instruction in detail means statementInDetails and imageDetails exist.
    }
}
