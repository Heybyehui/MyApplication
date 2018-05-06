package com.example.a95429.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class RActivity extends AppCompatActivity {
    Button bn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);
        bn_back = (Button)findViewById(R.id.fh4);

        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
