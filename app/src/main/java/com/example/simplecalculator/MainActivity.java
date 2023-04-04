package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul  , buttonC , buttonEqual;
   private EditText edt1 ;

    float ValueOne , ValueTwo ;

    boolean Addition , Subtract ,Multiplication ,Division ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setUpListeners();
    }
    private void initView(){
       button0 = findViewById(R.id.button0);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);
       button3 = findViewById(R.id.button3);
       button4 = findViewById(R.id.button4);
       button5 = findViewById(R.id.button5);
       button6 = findViewById(R.id.button6);
       button7 = findViewById(R.id.button7);
       button8 = findViewById(R.id.button8);
       button9 = findViewById(R.id.button9);
       buttonAdd = findViewById(R.id.buttonAdd);
       buttonSub = findViewById(R.id.buttonSub);
       buttonMul = findViewById(R.id.buttonMul);
       buttonDivision = findViewById(R.id.buttonDiv);
       buttonEqual = findViewById(R.id.buttonEql);
       buttonC = findViewById(R.id.buttonC);
       edt1 = findViewById(R.id.edt1);

    }


      public void setUpListeners() {

          button1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"1");
              }
          });

          button2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"2");
              }
          });

          button3.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"3");
              }
          });

          button4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"4");
              }
          });

          button5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"5");
              }
          });

          button6.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"6");
              }
          });

          button7.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"7");
              }
          });

          button8.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"8");
              }
          });

          button9.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"9");
              }
          });

          button0.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText(edt1.getText()+"0");
              }
          });

          buttonAdd.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  if (edt1 == null){
                      edt1.setText("");
                  }else {
                      ValueOne = Float.parseFloat(edt1.getText() + "");
                      Addition = true;
                      edt1.setText(null);
                  }
              }
          });

          buttonSub.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  ValueOne = Float.parseFloat(edt1.getText() + "");
                  Subtract = true ;
                  edt1.setText(null);
              }
          });

          buttonMul.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  ValueOne = Float.parseFloat(edt1.getText() + "");
                  Multiplication = true ;
                  edt1.setText(null);
              }
          });

          buttonDivision.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  ValueOne = Float.parseFloat(edt1.getText()+"");
                  Division = true ;
                  edt1.setText(null);
              }
          });

          buttonEqual.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  ValueTwo = Float.parseFloat(edt1.getText() + "");

                  if (Addition == true){

                      edt1.setText(ValueOne + ValueTwo +"");
                      Addition=false;
                  }


                  if (Subtract == true){
                      edt1.setText(ValueOne - ValueTwo+"");
                      Subtract=false;
                  }

                  if (Multiplication == true){
                      edt1.setText(ValueOne * ValueTwo+"");
                      Multiplication=false;
                  }

                  if (Division == true){
                      edt1.setText(ValueOne / ValueTwo+"");
                      Division=false;
                  }
              }
          });

          buttonC.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  edt1.setText("");
              }
          });


      }



}





