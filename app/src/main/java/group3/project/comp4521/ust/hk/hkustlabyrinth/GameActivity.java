package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.TextView;

import Views.ChessBoardView;

public class GameActivity extends Activity {

    BoardView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.testg);
        setContentView(R.layout.activity_game);
/**
        TextView questionText = (TextView) findViewById(R.id.questionText);
        TextView upAnsText = (TextView)findViewById(R.id.upAnsText);
        TextView downAnsText = (TextView) findViewById(R.id.downAnswerText);
        TextView leftAndText = (TextView) findViewById(R.id.leftAnsText);
        TextView rightAnsText = (TextView) findViewById(R.id.rightAnsText);

        FrameLayout gameLayout = (FrameLayout) findViewById(R.id.gameView);
        TextView tv = new TextView(this);
        tv.setText("Hello World");
        gameLayout.addView( tv );
        **/
        FrameLayout gameLayout = (FrameLayout) findViewById(R.id.gameView);
        v = new BoardView(this);
        gameLayout.addView(v);



    }




}
