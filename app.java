package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
private EditText edittext; private EditText edittext2; private Button button;
private TextView textview;

@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); edittext=findViewById(R.id.editTextTextPersonName); edittext2=findViewById(R.id.editTextTextPersonName2); button=findViewById(R.id.button); textview=findViewById(R.id.textView2);

button.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View view)
{
String weight=edittext.getText().toString();
int wt=Integer.parseInt(weight);
double w=(double)wt;
String height=edittext2.getText().toString();
int ht=Integer.parseInt(height);
double h=(double)ht/100;
double bmi=w/(h*h);
textview.setText("BMI = "+bmi+" kg per sq.m");
}
});
}
}
