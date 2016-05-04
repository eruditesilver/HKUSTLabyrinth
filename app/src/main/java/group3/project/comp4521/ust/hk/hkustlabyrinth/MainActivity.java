package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import Controller.DirectionGestureRecognizer;


public class MainActivity extends ActionBarActivity {

    private static final int EXIT = 1;
    private static final int ABOUT = 2;
    private static final int SETTINGS = 3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new StartGameListener());

        Button rankBuuton = (Button) findViewById(R.id.rankButton);
        rankBuuton.setOnClickListener(new RankBtnListener());

        Button userButton = (Button) findViewById(R.id.userButton);
        userButton.setOnClickListener(new UserBtnListener());



        DirectionGestureRecognizer dgr = new DirectionGestureRecognizer();

    }

    class StartGameListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, LvMenuActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }

    class RankBtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, RankActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }

    class UserBtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, UserActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        /*
            getMenuInflater().inflate(R.menu.menu_main, menu);
        */

        menu.add(0, EXIT, 1, R.string.exit);
        menu.add(0, ABOUT, 2, R.string.about);
        menu.add(0, SETTINGS, 3, R.string.action_settings);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == EXIT) {  // exit the game
            finish();
        }

        if (id == ABOUT) {
            // Jump to page / windows for "ABOUT this Game"
        }

        if (id == SETTINGS) {
            // Jump to page for "Setting"
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
