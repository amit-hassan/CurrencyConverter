package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertNow(View view) {

        EditText editText = findViewById(R.id.editTextId);
        TextView textView1 = findViewById(R.id.dollarDisplayTextId);
        TextView textView2 = findViewById(R.id.rupeeDisplayTextId);
        TextView textView3= findViewById(R.id.singaporeDollarDisplayTextId);
        TextView textView4 = findViewById(R.id.qatariRiyalDisplayTextId);

        String taka = editText.getText().toString();  //10tk

        Double takaInDouble = Double.parseDouble(taka); //10.00tk

        Double dollarInDouble = 0.012 * takaInDouble ;
        Double rupeeInDouble = 0.85 * takaInDouble;
        Double singaporeDollarInDouble = 0.016 * takaInDouble;
        Double qatarRiyalInDouble = 0.043 * takaInDouble;

        String dollarInString = String.valueOf(dollarInDouble);
        String rupeeInString = String.valueOf(rupeeInDouble);
        String singaporeDollarInString = String.valueOf(singaporeDollarInDouble);
        String qatarRiyalInString = String.valueOf(qatarRiyalInDouble);

        textView1.setText(dollarInString);
        textView2.setText(rupeeInString);
        textView3.setText(singaporeDollarInString);
        textView4.setText(qatarRiyalInString);

    }
}
