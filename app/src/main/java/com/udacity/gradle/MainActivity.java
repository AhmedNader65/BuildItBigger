package com.udacity.gradle.paid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.udacity.gradle.EndpointAsyncTask;

import mrerror.jokedisplay.JokeDisplayActivity;


public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar ;
    public String  joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        progressBar.setVisibility(View.VISIBLE);

        new EndpointAsyncTask().execute(this);

    }

    public void showJoke(String result){
        progressBar.setVisibility(View.GONE);
        joke = result;
        // Create Intent to launch JokeFactory Activity
        Intent intent = new Intent(MainActivity.this, JokeDisplayActivity.class);
        // Put the string in the envelope
        intent.putExtra("joke",result);
        startActivity(intent);
    }

}
