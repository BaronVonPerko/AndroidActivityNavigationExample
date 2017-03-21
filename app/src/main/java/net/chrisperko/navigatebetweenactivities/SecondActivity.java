package net.chrisperko.navigatebetweenactivities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Second");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadMessage();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void loadMessage() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);

        TextView tvMessage = (TextView) findViewById(R.id.tvMessage);
        tvMessage.setText(message);
    }
}
