package com.example.makjdrn.e_id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class DocumentView extends Activity{
    Button button, button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentview);
        button = (Button) findViewById(R.id.button5);
        button1 = (Button) findViewById(R.id.button6);
    }

    //TODO Check PIN correctness
    public void onClick(View view) {
        if(view == button) {
            //TODO Sending Data, popup.
        }
        else if(view == button1) {
            finish();
        }
    }
}
