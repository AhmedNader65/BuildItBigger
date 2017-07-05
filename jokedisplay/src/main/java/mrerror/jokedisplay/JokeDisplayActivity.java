package mrerror.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent intent =getIntent();
        if(intent.hasExtra("joke")){
            TextView jokeTV = (TextView) findViewById(R.id.joke);
            jokeTV.setText(intent.getStringExtra("joke"));
        }
    }
}
