package com.udacity.gradle.paid;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.EndpointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by ahmed on 05/07/17.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest  {
    private String result;

    @Test
    public void testDataRetrieval() throws Exception {

        EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask();
        endpointsAsyncTask.execute();
        Thread.sleep(5000);
        try {
            result = endpointsAsyncTask.get();
            Log.d("non-empty Test", "get non-empty string successfully >> " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}