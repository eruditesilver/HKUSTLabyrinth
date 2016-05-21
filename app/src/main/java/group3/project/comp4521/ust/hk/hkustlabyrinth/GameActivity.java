package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    TextView questionText = (TextView) findViewById(R.id.questionText);
    TextView upAnsText = (TextView)findViewById(R.id.upAnsText);
    TextView downAnsText = (TextView) findViewById(R.id.downAnswerText);
    TextView leftAndText = (TextView) findViewById(R.id.leftAnsText);
    TextView rightAnsText = (TextView) findViewById(R.id.rightAnsText);


}
