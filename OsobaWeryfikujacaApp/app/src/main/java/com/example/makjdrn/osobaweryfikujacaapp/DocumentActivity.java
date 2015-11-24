package com.example.makjdrn.osobaweryfikujacaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class DocumentActivity extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentactivity);
        button = (Button) findViewById(R.id.button2);
    }

    //TODO Check PIN
    public void onClick(View view) {
        if (view == button) {
            Intent intent = new Intent(DocumentActivity.this, DocumentView.class);
            startActivity(intent);
            finish();
        }
    }
}
