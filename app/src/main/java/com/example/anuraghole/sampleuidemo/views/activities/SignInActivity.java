package com.example.anuraghole.sampleuidemo.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.anuraghole.sampleuidemo.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvSignUp;
    Button bnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();
        setListeners();

    }

    private void setListeners() {
        tvSignUp.setOnClickListener(this);
        bnContinue.setOnClickListener(this);
    }

    private void init() {
        tvSignUp = findViewById(R.id.tvSignUp);
        bnContinue = findViewById(R.id.bnContinue);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvSignUp:
                goToSignUp();
                break;
            case R.id.bnContinue:
                goToSelectFavourites();
                break;
        }

    }

    private void goToSelectFavourites() {
        Intent intent = new Intent(this, SelectFavouritesActivity.class);
        startActivity(intent);
    }

    private void goToSignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
