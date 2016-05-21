package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LvMenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_menu);

        Button Lv1Button = (Button) findViewById(R.id.lv1btn);
        Lv1Button.setOnClickListener(new Lv1BtnListener());

        Button Lv2Button = (Button) findViewById(R.id.lv2btn);
        Lv2Button.setOnClickListener(new Lv2BtnListener());

        Button Lv3Button = (Button) findViewById(R.id.lv3btn);
        Lv3Button.setOnClickListener(new Lv3BtnListener());
    }



    // All listeners for level # Buttons
    class Lv1BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            // TODO: send info to game activity

            intent.setClass(LvMenuActivity.this, GameActivity.class);
            LvMenuActivity.this.startActivity(intent);
        }
    }

    class Lv2BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            // TODO: send info to game activity

            intent.setClass(LvMenuActivity.this, GameActivity.class);
            LvMenuActivity.this.startActivity(intent);
        }
    }

    class Lv3BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            // TODO: send info to game activity

            intent.setClass(LvMenuActivity.this, GameActivity.class);
            LvMenuActivity.this.startActivity(intent);
        }
    }




}
