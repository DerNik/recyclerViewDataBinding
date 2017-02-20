package dernik.recyclerviewdatabinding.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import dernik.recyclerviewdatabinding.R;

public class MainActivity extends AppCompatActivity {
    public final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
