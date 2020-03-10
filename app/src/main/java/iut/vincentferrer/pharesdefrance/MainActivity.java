package iut.vincentferrer.pharesdefrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MainActivity";
    public static String NOM = "nom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connect(View v) {
        String username = ((EditText)findViewById(R.id.username)).getText().toString();
        String pwd = ((EditText)findViewById(R.id.password)).getText().toString();
        if (pwd.equals("xxx")) {
            Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Welcome");

            Intent details = new Intent(MainActivity.this, Details.class);
            details.putExtra(NOM, username);
            startActivity(details);
        } else {
            Toast.makeText(getApplicationContext(),"invalid password",Toast.LENGTH_SHORT).show();
            Log.d(TAG, "invalid passwd");
        }
    }

    public void eraseFormConnect(View v) {
        ((EditText)findViewById(R.id.username)).setText(null);
        ((EditText)findViewById(R.id.password)).setText(null);
        ((EditText)findViewById(R.id.dateBirth)).setText(null);
    }
}
