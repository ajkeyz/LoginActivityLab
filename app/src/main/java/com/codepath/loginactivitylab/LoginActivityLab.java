package com.codepath.loginactivitylab;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivityLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_lab);


    }
    public void signUp(View v){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("http://www.airbnb.com/signup_login"));
        startActivity(intent);
    }
}
