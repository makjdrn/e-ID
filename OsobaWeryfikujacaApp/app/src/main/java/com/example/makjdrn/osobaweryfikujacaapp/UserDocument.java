package com.example.makjdrn.osobaweryfikujacaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class UserDocument extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdocument);
        button = (Button) findViewById(R.id.button3);
    }
    public void onClick(View view) {
        if(view == button) {
            finish();
        }
    }
}
