package com.example.android.homeworkgdg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View v) {
        Toast.makeText(MainActivity.this, "First Toast Ever",
                Toast.LENGTH_LONG).show();
    }
}
