package com.romaingobert.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtOperate1;
    private EditText edtOperate2;

    private Button btnSubstraction;
    private Button btnAddition;
    private Button btnDivision;
    private Button btnMultiplication;

    private TextView texResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOperate1 = (EditText) findViewById(R.id.edtOperate1);
        edtOperate2 = (EditText) findViewById(R.id.edtOperate2);

        btnSubstraction = (Button) findViewById(R.id.button);
        btnAddition = (Button) findViewById(R.id.button2);
        btnDivision = (Button) findViewById(R.id.button3);
        btnMultiplication = (Button) findViewById(R.id.button4);

        texResult = (TextView) findViewById(R.id.texResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtOperate1.getText().length()>0 && edtOperate2.getText().length()>0) {
                    double ope1 = Double.parseDouble(edtOperate1.getText().toString());
                    double ope2 = Double.parseDouble(edtOperate2.getText().toString());

                    double theResult = ope1 + ope2;
                    texResult.setText(Double.toString(theResult));
                }else{
                    Toast.makeText(MainActivity.this, "Merci de saisir un vrai nombre", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //TODO others btn and clr button

        /*
        edtOperate1.setText("");
        texResult.setText("0.00");
        edtOperate1.requestFocus();
        */


    }
}
