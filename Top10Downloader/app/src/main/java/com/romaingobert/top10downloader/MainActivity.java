package com.romaingobert.top10downloader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private class downloadData extends AsyncTask<String, void, String>{

        private String mFileContent;

        @Override
        protected String doInBackground(String... params) {

            mFileContent = downloadXMLFILE(params[0]);
            if (mFileContent == null){
                Log.d("DownloadData", "Error Download");
            }else {
                return mFileContent;
            }
        }

        private downloadXMLFILE(String urlPath){

            StringBuilder tempBuffer = new StringBuilder();
            try {

                URL url = new URL(urlPath);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                int  response = connection.getResponseCode():
                Log.d("DownloadData", "response code = " + response );
                InputStream is = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);

            } catch(IOException e){
                Log.d("DownloadData", "IO Exception" + e.getMessage());
        }

        }
    }


}
