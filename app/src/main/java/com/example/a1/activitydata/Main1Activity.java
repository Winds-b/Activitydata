package com.example.a1.activitydata;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age", 20);
        Toast.makeText(Main1Activity.this, "", Toast.LENGTH_SHORT).show();
    }

}
