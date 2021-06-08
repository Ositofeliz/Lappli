package Animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.lappli.R;

public class AnimationLoading extends AppCompatActivity {

    private static final String TAG = "AnimationLoading";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_loading);

        Intent intent = getIntent();
        String titreAnimationLoading = intent.getStringExtra("titre_AnimationLoading");

        Log.i(TAG, "onCreate: " + titreAnimationLoading);

        // Création du lien entre la vue et le code
        ImageView imageView_Loading = findViewById(R.id.imageView_Loading);

        // Animation de l'image
        // Fade pour faire apapraitre l'image et la faire tourner en même temps
        imageView_Loading.animate().alpha(1).rotation(3600).setDuration(2000);
    }
}