package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import Controller.DirectionGestureRecognizer;
import Controller.GestureAction;
import Views.ChessBoardView;
import Views.MotionInstructionView;


public class MainActivity extends ActionBarActivity {
    DirectionGestureRecognizer dgr = new DirectionGestureRecognizer();
    private GestureDetector gdt = new GestureDetector(dgr);
    private ChessBoardView chessBoardView;
    private MotionInstructionView motionInstructionView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chessBoardView = null;
        initGameViewListener();
        chessBoardView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gdt.onTouchEvent(motionEvent);
                return false;
            }
        });
        motionInstructionView = null;
    }

    private void initGameViewListener() {
        dgr.setListener(new GestureAction() {
            @Override
            public void onLeftSwipe() {

            }

            @Override
            public void onRightSwipe() {

            }

            @Override
            public void onDownSwipe() {

            }

            @Override
            public void onUpSwipe() {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
