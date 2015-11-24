package com.example.makjdrn.osobaweryfikujacaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class DocumentView extends Activity {
    Button bwyjscie, bpolacz, bwyslijdane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentview);
        bpolacz = (Button) findViewById(R.id.bpolacz);
        bwyslijdane = (Button) findViewById(R.id.bwyslijdane);
        bwyjscie = (Button) findViewById(R.id.bwyjscie);
    }

    public void onClick(View view) {
        if (view == bpolacz) {
            //TODO Connect to Server and receive data.
            Intent intent = new Intent(DocumentView.this, UserDocument.class);
            startActivity(intent);
        }
        else if(view == bwyslijdane) {
            //TODO Send data
        }
        else if(view == bwyjscie) {
            finish();
            System.exit(0);
        }
    }
}
