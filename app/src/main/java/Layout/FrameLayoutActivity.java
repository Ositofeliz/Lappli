package Layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.lappli.R;

public class FrameLayoutActivity extends AppCompatActivity {

    private static final String TAG = "FrameLayoutActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        //Intent intent = getIntent();
        //String titreFrameLayout = intent.getStringExtra("titre_FrameLayout");
        //Log.i(TAG, "onCreate: " + titreFrameLayout);




    }
}