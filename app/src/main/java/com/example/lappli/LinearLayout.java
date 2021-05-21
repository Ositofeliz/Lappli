package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {

    private static final String TAG = "LinearLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);


        // Récupérer les données placées dans le putExtra de l'intent de MainActivity
        Intent intent = getIntent();
        String titreLinearLayout = intent.getStringExtra("titre_LinearLayout"); // on récupère la valeur en fonction de la clé

        Log.i(TAG, "onCreate: " + titreLinearLayout);

        // On associe le TextView du design au code
        TextView textViewTitre = findViewById(R.id.textView_titre);

        textViewTitre.setText(titreLinearLayout);
    }
}