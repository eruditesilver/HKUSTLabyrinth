package Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import Controller.DirectionGestureRecognizer;
import Controller.GestureAction;
import Model.BonusPosition;
import Model.GridBoard;
import Model.Movement;
import Model.Path;
import Model.Player;
import Model.Position;

/**
 * Created by sfwongac on 3/22/2016.
 */
public class ChessBoardView extends View {
    private GridBoard gridBoard;

    public ChessBoardView(Context context) {
        super(context);
        gridBoard = new GridBoard(1);
        //updateBoard();
        //updatePlayerPosition();

    }

    public ChessBoardView(Context context, int level) {
        super(context);
        gridBoard = new GridBoard(level);
        //updateBoard();
        //updatePlayerPosition();

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Rect ourRect = new Rect();
        ourRect.set(0,0,50,50);

        Paint black = new Paint();
        black.setColor(Color.BLACK);
        black.setStyle(Paint.Style.FILL);

        Paint white = new Paint();
        white.setColor(Color.WHITE);
        white.setStyle(Paint.Style.FILL);



        int column = gridBoard.getColumn();
        int row = gridBoard.getRow();

        // Draw chessboard
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if(i == j){
                    canvas.drawRect(ourRect, black);
                }else{
                    canvas.drawRect(ourRect, white);
                }

            }
        }

    }


    private void updateBoard() {
        //TODO: generate a grid and display the bonus
        int column = gridBoard.getColumn();
        int row = gridBoard.getRow();

        Path path = gridBoard.getCorrectPath();


        //for (Position p = path.getStartPosition(); p == null; p = path.getNextPosition(p)) {
        //}
    }


    public void updatePlayerPosition() {
        //TODO: update the view according to the player position
        Position currentPosition = gridBoard.getPlayer().getCurrentPosition();
        //TODO: if player reach the end
        if (gridBoard.goal()) {

        }
    }


}
