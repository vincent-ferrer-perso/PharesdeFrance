package iut.vincentferrer.pharesdefrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.NOM);
        ((TextView)findViewById(R.id.detailUsername)).setText("Bienvenue " + username);

    }


    public void deconnect(View v) {
            Intent details = new Intent(Details.this, MainActivity.class);
            startActivity(details);
    }
}
