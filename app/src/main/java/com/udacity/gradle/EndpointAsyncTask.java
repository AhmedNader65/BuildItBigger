package com.udacity.gradle;

import android.os.AsyncTask;

import com.example.ahmed.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.paid.MainActivity;

import java.io.IOException;

/**
 * Created by ahmed on 05/07/17.
 */

public class EndpointAsyncTask extends AsyncTask<MainActivity, Void, String> {
    private MyApi myApiService = null;
    MainActivity mainActivity = null;
    @Override
    protected String doInBackground(MainActivity... params) {
        if(params.length>0)
            mainActivity = params[0];
        if(myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null);
            builder.setRootUrl("https://gradlefinalproject.appspot.com/_ah/api/");
            // end options for devappserver

            myApiService = builder.build();
        }

        try {
            return myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        if(mainActivity!=null)
            mainActivity.showJoke(result);
    }
}