package com.project.patienttracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Patient extends Activity {
    Button btn,btn1;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient);
        btn=(Button) findViewById(R.id.btn);
        btn1=(Button) findViewById(R.id.btn1);
        tv4=(TextView) findViewById(R.id.tv4);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Patient.this,Login.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Patient.this,Register.class);
                startActivity(intent);
            }
        });

    }
}
