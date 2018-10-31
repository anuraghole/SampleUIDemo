package com.example.anuraghole.sampleuidemo.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.views.activities.SignInActivity;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        init();
    }

    private void init() {
        bnSignIn=findViewById(R.id.bnSignIn);
        bnSignIn.setOnClickListener(this);

    }

    public void onClickb(View view) {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bnSignIn:
                gotoSignInPage();
                break;
        }
    }

    private void gotoSignInPage() {
        startActivity(new Intent(this,SignInActivity.class));
    }
}
