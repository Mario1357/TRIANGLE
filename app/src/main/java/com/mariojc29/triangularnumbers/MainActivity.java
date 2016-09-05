package com.mariojc29.triangularnumbers;

import android.support.v7.app.AppCompatActivity;
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

    public void checkNumber(View view) {
        EditText txNumber = (EditText) findViewById(R.id.numero);
        TextView txMessage = (TextView) findViewById(R.id.texto);


        String sNumber = txNumber.getText().toString().trim();
        Integer number = Integer.parseInt(sNumber);

        String message;
        if (IsSquareNumber(number)) {
            message = sNumber + " is a square number";
        } else {
            if (IsTriangularNumber(number)) {
                message = sNumber + " is a triangular number";
            } else {
                message = sNumber + "is neither square nor triangular";
            }
        }

        txMessage.setText(message);
    }
        public void limpiar(View view){
            EditText Numbers = (EditText) findViewById(R.id.numero);
            TextView Mensaje = (TextView) findViewById(R.id.texto);

            String limpio;
            limpio = "";
            Numbers.setText(limpio);
            Mensaje.setText(limpio);
    }


    public boolean IsSquareNumber(int number) {
        double squareRoot = Math.sqrt(number);
        return squareRoot == Math.floor(squareRoot);
    }

    public boolean IsTriangularNumber(int number) {
        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber += x;
        }
        return triangularNumber == number;
    }
}
