package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //1- Déclaration du bouton
    Button button;

    //4- on fait un log pour dire quand on passe dans chacune de nos méthodes
    // on va faire un tag pour ça
    // Tip : pour faire vite, on peut écrire logt
    private static final String TAG = "MainActivity";
    //5 on peut ajouter des logi dans chacune des méthodes ensuite


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2- lien entre design et code
        button = findViewById(R.id.button);

        //6-  on ajoute ici un clicklistener sur le bouton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //7- on lance et on teste
            }
        });
    }

    //3- on déclare les méthodes du cycle de vie de l'activité
    @Override
    protected void onStart() {
        super.onStart();
        //4
        Log.i(TAG, "onStart: ");
    }

    //3
    @Override
    protected void onResume() {
        super.onResume();
        //5
        Log.i(TAG, "onResume: ");
    }

    //3
    @Override
    protected void onPause() {
        super.onPause(); // enregistre les infos dans le cache
        //5
        Log.i(TAG, "onPause: ");
    }

    //3
    @Override
    protected void onStop() {
        super.onStop();
        //5
        Log.i(TAG, "onStop: ");
    }

    //3
    @Override
    protected void onRestart() {
        super.onRestart();
        //5
        Log.i(TAG, "onRestart: ");
    }

    //3
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //5
        Log.i(TAG, "onDestroy: ");
    }


}