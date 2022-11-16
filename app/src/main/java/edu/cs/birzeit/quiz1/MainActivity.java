package edu.cs.birzeit.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtWeight;
    private EditText edtHeight;
    private Switch switchGender;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupviews();

    }
    public void setupviews(){
        edtWeight=findViewById(R.id.edtWeight);
        edtHeight=findViewById(R.id.edtHeight);
        switchGender=findViewById(R.id.switchGender);
        btnCalc=findViewById(R.id.btnCalc);

       btnCalc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               double w= Double.parseDouble(edtHeight.getText().toString());
               double h= Double.parseDouble(edtHeight.getText().toString());

               double bmi= w/(h*h);
               if(switchGender.isChecked()){
                   bmi+=0.05;

               }
               Toast.makeText(this,"BMI is: "+bmi,Toast.LENGTH_LONG).show();
           }
       });





    }
}