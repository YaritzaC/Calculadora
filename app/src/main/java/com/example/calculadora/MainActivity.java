package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pant;
    private double operan1, operan2;
    private double resul;
    private int ope;

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pant = (EditText) findViewById(R.id.caja);


        btn1 = (Button) findViewById(R.id.btnuno);
        btn2 = (Button) findViewById(R.id.btndos);
        btn3 = (Button) findViewById(R.id.btntres);
        btn4 = (Button) findViewById(R.id.btncuatro);
        btn5 = (Button) findViewById(R.id.btncinco);
        btn6 = (Button) findViewById(R.id.btnseis);
        btn7 = (Button) findViewById(R.id.btnsiete);
        btn8 = (Button) findViewById(R.id.btnocho);
        btn9 = (Button) findViewById(R.id.btnnueve);
        btn0 = (Button) findViewById(R.id.btncero);
        btnpunto = (Button) findViewById(R.id.btnpunto);

        btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String cap = pant.getText().toString();
               cap = cap + "1";
               pant.setText(cap);
           }
       });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "2";
                pant.setText(cap);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "3";
                pant.setText(cap);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "4";
                pant.setText(cap);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "5";
                pant.setText(cap);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "6";
                pant.setText(cap);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "7";
                pant.setText(cap);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "8";
                pant.setText(cap);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "9";
                pant.setText(cap);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + "0";
                pant.setText(cap);
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = pant.getText().toString();
                cap = cap + ".";
                pant.setText(cap);
            }
        });

    }




    public void btnpunto (View v){
        String cap = pant.getText().toString();
        cap = cap + ".";
        pant.setText(cap);
    }

    public void suma (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 1;
    }

    public void resta (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 2;
    }

    public void multiplicacion (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 3;
    }

    public void division (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 4;
    }

    public void potencia (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 5;
    }

    public void porcentaje (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 6;
    }

    public void raiz (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("√(" + operan1 + ")");
        ope = 7;
    }

    public void sin (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("sin(" + operan1 + ")");
        ope = 8;
    }

    public void cos (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("cos(" + operan1 + ")");
        ope = 9;
    }

    public void tan (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("tan(" + operan1 + ")");
        ope = 10;
    }

    public void csc (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("csc(" + operan1 + ")");
        ope = 11;
    }

    public void sec (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("sec(" + operan1 + ")");
        ope = 12;
    }

    public void ctg (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("ctg(" + operan1 + ")");
        ope = 13;
    }

    public void factorial (View v){
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope = 14;
    }

    public void igual (View v) {
        try {
            String aux2 = pant.getText().toString();
            operan1 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {}
        pant.setText("");

        if (ope == 1) {
            resul = operan1 + operan2;
        } else if (ope == 2) {
            resul = operan1 - operan2;
        } else if (ope == 3) {
            resul = operan1 * operan2;
        } else if (ope == 4) {
            if (operan2 == 0)
                pant.setText("Error");
            else {
                resul = operan1 / operan2;
            }
        }
    }
}
