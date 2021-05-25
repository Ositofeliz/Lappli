package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class LinearVerticalActivity extends AppCompatActivity {

    private static final String TAG = "LinearLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_vertical);

        Intent intent = getIntent();
        String titreVerticalLinearLayout = intent.getStringExtra("titre_VerticalLinearLayout");

        Log.i(TAG, "onCreate: " + titreVerticalLinearLayout);

        

    }
}