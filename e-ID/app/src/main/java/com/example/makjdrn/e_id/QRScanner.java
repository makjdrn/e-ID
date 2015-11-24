package com.example.makjdrn.e_id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class QRScanner extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner);
        button = (Button) findViewById(R.id.button2);
    }

    public void onClick(View view) {
        if(view == button) {
            //TODO Zeskanowanie QR kodu, przesłanie danych i kluczy.
            Intent intent = new Intent(QRScanner.this, SetPIN.class);
            startActivity(intent);
            finish();
        }
    }
}
