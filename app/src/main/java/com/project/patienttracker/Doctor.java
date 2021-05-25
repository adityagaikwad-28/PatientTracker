package com.project.patienttracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Doctor extends Activity {
    TextView tv3;
    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor);
    }
}
