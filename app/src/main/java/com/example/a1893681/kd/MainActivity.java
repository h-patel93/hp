package com.example.a1893681.kd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nmae,emai,pass;
    Button btn;
    static String TAG = "My info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmae = findViewById(R.id.txte);
        emai = findViewById(R.id.txtemail);
        pass = findViewById(R.id.txtp);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm =  nmae.getText().toString();
                String em =  nmae.getText().toString();
                Log.v(TAG,nm);
                Log.v(TAG,em);
                


            }
        });


    }
}
