package com.project.patienttracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Patient extends Activity {
    ImageView img3;
    Button btn,btn1;
    TextView tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient);
        img3=(ImageView) findViewById(R.id.img3);
        btn=(Button) findViewById(R.id.btn);
        btn1=(Button) findViewById(R.id.btn1);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);

    }
}
