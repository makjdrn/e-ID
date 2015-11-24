package com.example.makjdrn.e_id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by makjdrn on 2015-11-24.
 */
public class FinalWindow extends Activity {
    Button bdokument, bwyjscie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalwindow);
        bdokument = (Button) findViewById(R.id.bdokument);
        bwyjscie = (Button) findViewById(R.id.bwyjscie);
    }

    public void onClick(View view) {
        if(view == bdokument) {
            Intent intent = new Intent(FinalWindow.this, DocumentActivity.class);
            startActivity(intent);
        }
        else if(view == bwyjscie) {
            finish();
            System.exit(0);
        }
    }
}
