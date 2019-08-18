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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pant = (EditText) findViewById(R.id.caja);

    }


    public void btnuno (View v){
        String cap = pant.getText().toString();
        cap = cap + "1";
        pant.setText(cap);
    }

    public void btndos (View v){
        String cap = pant.getText().toString();
        cap = cap + "2";
        pant.setText(cap);
    }

    public void btntres (View v){
        String cap = pant.getText().toString();
        cap = cap + "3";
        pant.setText(cap);
    }

    public void btncuatro (View v){
        String cap = pant.getText().toString();
        cap = cap + "4";
        pant.setText(cap);
    }

    public void btncinco (View v){
        String cap = pant.getText().toString();
        cap = cap + "5";
        pant.setText(cap);
    }

    public void btnseis (View v){
        String cap = pant.getText().toString();
        cap = cap + "6";
        pant.setText(cap);
    }

    public void btnsiete (View v){
        String cap = pant.getText().toString();
        cap = cap + "7";
        pant.setText(cap);
    }

    public void btnocho (View v){
        String cap = pant.getText().toString();
        cap = cap + "8";
        pant.setText(cap);
    }

    public void btnnueve (View v){
        String cap = pant.getText().toString();
        cap = cap + "9";
        pant.setText(cap);
    }

    public void btncero (View v){
        String cap = pant.getText().toString();
        cap = cap + "0";
        pant.setText(cap);
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
            operan2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {}
        pant.setText("");

        if (ope == 1) {
            resul = operan1 + operan2;
            pant.setText("" + resul);
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
        } else if (ope==5){
            resul = Math.pow(operan1,operan2);

        } else if (ope==7){
            resul = Math.sqrt(operan1);
        }
        else if (ope==14){
            resul = 1;
            for (double i = operan1; i>=1; i--){
                resul =resul * i;
            }
        }
        pant.setText("" + resul);
        operan1 = resul;
    }


    public void clear (View v){
        pant.setText("");
        operan1=0.0;
        operan2=0.0;
        resul=0.0;
    }

    public void borrar (View v){
        if (!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0, pant.getText().length()-1) + "");
        }
    }
}
