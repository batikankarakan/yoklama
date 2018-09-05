package com.example.nisa.eylul4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BatikanMainActivity extends AppCompatActivity {

    EditText nameEnter, surnameEnter, emailenter, passwordenter, confirmpasswordenter;
    Button signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batikan_activity_main);
    }
}
