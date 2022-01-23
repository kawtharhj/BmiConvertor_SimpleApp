package com.example.bmisimpleappcalculation_30_11_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView vname,vheight,vweight, VR;
    private Button Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vname = findViewById(R.id.edtTxt);
        vheight = findViewById(R.id.edtHeight);
        vweight = findViewById(R.id.edtTxtWeght);
        Result = findViewById(R.id.button);
        VR = findViewById(R.id.textView6);
    }

    public void  onClick(View v){
        double W , H , Res;
        W = Double.parseDouble(vweight.getText().toString());
        H = Double.parseDouble(vheight.getText().toString());

        Res = W /(H*H);
        VR.setText("Bmi value for "+vname.getText()+" is : "+Res);

    }
}






