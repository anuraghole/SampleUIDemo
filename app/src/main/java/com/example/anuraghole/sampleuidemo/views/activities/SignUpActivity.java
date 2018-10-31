package com.example.anuraghole.sampleuidemo.views.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.anuraghole.sampleuidemo.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        setListeners();

    }

    private void setListeners() {
        tvSignIn.setOnClickListener(this);
    }

    private void init() {
        tvSignIn=findViewById(R.id.tvSignIn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvSignIn:
                goToSignIn();
                break;
        }

    }

    private void goToSignIn() {
        Intent intent=new Intent(this,SignInActivity.class);
        startActivity(intent);
    }
}
