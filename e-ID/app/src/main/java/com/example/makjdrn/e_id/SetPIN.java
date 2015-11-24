package com.example.makjdrn.e_id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class SetPIN extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setpin);
        button = (Button) findViewById(R.id.button3);
    }

    //TODO Handle PIN, Send Keys.
    public void onClick(View view) {
        if(view == button) {
            Intent intent = new Intent(SetPIN.this, FinalWindow.class);
            startActivity(intent);
            finish();
        }
    }
}
