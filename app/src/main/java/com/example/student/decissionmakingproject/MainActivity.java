package com.example.student.decissionmakingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.resultId);
        editText=findViewById(R.id.editId);
    }

    public void checkNumber(View view) {

        int number= Integer.parseInt(editText.getText().toString());//integer type a rakhar jonno
        if(number>0)
        {
            //positive
            textView.setText("number is positive");
        }
else if(number<0)
        {
            textView.setText("number is negative");
            //negative
        }
        else{

            textView.setText("number is zero");
            //number is zero
        }

    }
}
