package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Animation.AnimationLoading;
import Layout.FrameLayoutActivity;
import Layout.LinearLayout;
import Layout.LinearVerticalActivity;

public class MainActivity extends AppCompatActivity {

    Button bt_linearLayout;
    Button bt_VerticalLinearLayout;
    Button bt_Loading;
    Button bt_FrameLayout;
    Button bt_Simpsons;
    Button bt_RelativeLayout;


    // TEST GIT

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_linearLayout = findViewById(R.id.bt_linearLayout);
        // Récupération du contenu du texte pour le fournir à putExtra
        String titre_linearLayout = bt_linearLayout.getText().toString();

        bt_VerticalLinearLayout = findViewById(R.id.bt_VerticalLinearLayout);
        String titre_VerticalLinearLayout = bt_VerticalLinearLayout.getText().toString();

        bt_Loading = findViewById(R.id.bt_Loading);
        String titre_AnimationLoading = bt_Loading.getText().toString();

        bt_FrameLayout = findViewById(R.id.bt_FrameLayout);
        String titre_FrameLayout = bt_FrameLayout.getText().toString();

        bt_Simpsons = findViewById(R.id.bt_Simpsons);
        String titre_AnimationSimpsonsActivity = bt_Simpsons.getText().toString();

        bt_RelativeLayout = findViewById(R.id.bt_RelativeLayout);
        String titre_RelativeLayout = bt_RelativeLayout.getText().toString();



        bt_linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Création d'un intent
                Intent intent_linearlayout = new Intent(MainActivity.this, LinearLayout.class);
                // préparation del'envoi des données vers la deuxième activité
                intent_linearlayout.putExtra("titre_LinearLayout", titre_linearLayout);
                // lancement de la deuxième activité
                startActivity(intent_linearlayout);
            }
        });

        bt_VerticalLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_VerticalLinearLayout = new Intent(MainActivity.this, LinearVerticalActivity.class);
                intent_VerticalLinearLayout.putExtra("titre_VerticalLinearLayout",titre_VerticalLinearLayout);
                startActivity(intent_VerticalLinearLayout);
            }
        });

        bt_Loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_AnimationLoading = new Intent(MainActivity.this, AnimationLoading.class);
                intent_AnimationLoading.putExtra("titre_AnimationLoading", titre_AnimationLoading);
                startActivity(intent_AnimationLoading);
            }
        });

        bt_Simpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Simpsons = new Intent(MainActivity.this, AnimationSimpsonsActivity.class);
                //intent_Simpsons.putExtra("titre_Simpsons", titre_AnimationSimpsonsActivity);
                startActivity(intent_Simpsons);
            }
        });

        bt_FrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_FrameLayout = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent_FrameLayout);
            }
        });

        bt_RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_RelativeLayout = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent_RelativeLayout);
            }
        });



        
    }

}