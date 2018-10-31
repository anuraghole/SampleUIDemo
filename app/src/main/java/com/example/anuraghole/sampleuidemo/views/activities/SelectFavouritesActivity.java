package com.example.anuraghole.sampleuidemo.views.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anuraghole.sampleuidemo.R;

public class SelectFavouritesActivity extends AppCompatActivity {
Button bnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_favourites);
        bnContinue=findViewById(R.id.bnContinue);
        bnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SelectFavouritesActivity.this,ShowListActivity.class);
                startActivity(intent);
            }
        });
    }
}
