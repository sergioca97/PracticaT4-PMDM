package com.studium.prcticat4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {

    Button btnCalcular;
    EditText edtNumeroEntero;
    TextView txtResultadoPrimos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        btnCalcular = findViewById(R.id.btnCalcular);
        edtNumeroEntero = findViewById(R.id.edtNumeroEntero);
        txtResultadoPrimos = findViewById(R.id.txtResultadoPrimos);
        this.setTitle(R.string.titleNumeros);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtNumeroEntero.getText().toString().isEmpty()) {
                    txtResultadoPrimos.setText("Error introduzca un número.");
                } else {
                    int num = Integer.parseInt(edtNumeroEntero.getText().toString());
                    boolean prime = true;
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            prime = false;
                        }
                    }
                    if (prime)
                        txtResultadoPrimos.setText("Este número es primo");
                    else
                        txtResultadoPrimos.setText("Este número NO es primo");
                }
            }
        });
    }

}

