package Layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.lappli.R;

public class LinearVerticalActivity extends AppCompatActivity {

    private static final String TAG = "LinearVerticalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_vertical);

        Intent intent = getIntent();
        String titreVerticalLinearLayout = intent.getStringExtra("titre_VerticalLinearLayout");

        Log.i(TAG, "onCreate: " + titreVerticalLinearLayout);



    }
}