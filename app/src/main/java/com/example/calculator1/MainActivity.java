package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int resultTextView;
    int solutionTextView;
    MaterialButton buttonAc, buttonPlusOrMinus, buttonProcent;
    MaterialButton buttonDivide, buttonMultiply, buttonMinus, buttonPlus, buttonEquals;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (R.id.result_text_view);
        solutionTextView =(R.id.solution_text_view);

       assignId(buttonAc,R.id.button_ac);
       assignId(buttonPlusOrMinus,R.id.button_plus_or_minus);
       assignId(buttonProcent,R.id.button_procent);
       assignId(buttonDivide,R.id.button_divide);
       assignId(buttonMultiply,R.id.button_multiply);
       assignId(buttonMinus,R.id.button_minus);
       assignId(buttonPlus,R.id.button_plus);
       assignId(buttonEquals,R.id.button_equals);
       assignId(button0,R.id.button_0);
       assignId(button1,R.id.button_1);
       assignId(button2,R.id.button_2);
       assignId(button3,R.id.button_3);
       assignId(button4,R.id.button_4);
       assignId(button5,R.id.button_5);
       assignId(button6,R.id.button_6);
       assignId(button7,R.id.button_7);
       assignId(button8,R.id.button_8);
       assignId(button9,R.id.button_9);
       assignId(buttonPoint,R.id.button_point);


    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTextView

        dataToCalculate = dataToCalculate+buttonText;


    }
}