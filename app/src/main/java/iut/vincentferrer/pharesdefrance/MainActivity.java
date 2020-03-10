package iut.vincentferrer.pharesdefrance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Button)findViewById(R.id.buttonLogin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pwd = ((EditText)findViewById(R.id.password)).getText().toString();
                if (pwd.equals("xxx")) {
                    Log.d(TAG, "Welcome");
                } else {
                    Log.d(TAG, "invalid passwd");
                }
            }
        });
    }
}
