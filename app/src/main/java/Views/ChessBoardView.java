package Views;

import android.content.Context;
import android.view.View;

import Model.GridBoard;

/**
 * Created by sfwongac on 3/22/2016.
 */
public class ChessBoardView extends View{
    private GridBoard gridBoard;
    public ChessBoardView(Context context, int level) {
        super(context);
        gridBoard = new GridBoard(level);
    }
}
