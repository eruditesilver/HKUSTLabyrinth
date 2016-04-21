package group3.project.comp4521.ust.hk.hkustlabyrinth;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Model.User;

public class UserActivity extends ActionBarActivity {

    private EditText editText = null;
    private Button createBtn = null;
    private String username;
    private long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        editText = (EditText)findViewById(R.id.editText);
        username = editText.getText().toString();

        createBtn = (Button) findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new CreateUserListener());


    }

    class CreateUserListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            User user = new User(username, id);

            // unsure whether using finish() here
            finish();

        }
    }


}
