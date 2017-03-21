package net.chrisperko.navigatebetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "net.chrisperko.navigatebetweenactivities.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireUp();
        getSupportActionBar().setTitle("Navigation");
    }

    private void wireUp() {
        Button btnOpenSecondActivity = (Button) findViewById(R.id.btnOpenSecondActivity);
        btnOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                EditText etMessage = (EditText) findViewById(R.id.etMessage);
                String message = etMessage.getText().toString();
                intent.putExtra(MESSAGE, message);

                startActivity(intent);
            }
        });
    }
}
