package com.example.a95429.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
public class LActivity extends AppCompatActivity {

    Button bn_back,bn_level,bn_vertical,bn_left;
    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l);
        layout = (LinearLayout)findViewById(R.id.BL);
        bn_back = (Button)findViewById(R.id.fh3);
        bn_level = (Button)findViewById(R.id.bn_level);
        bn_vertical = (Button)findViewById(R.id.bn_vertical);
        bn_left = (Button)findViewById(R.id.bn_left);

        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bn_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        bn_vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.VERTICAL);
            }
        });

        bn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setGravity(Gravity.LEFT);
            }
        });
    }
}
