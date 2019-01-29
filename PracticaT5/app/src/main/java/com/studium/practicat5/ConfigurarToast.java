package com.studium.practicat5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ConfigurarToast extends AppCompatActivity {

    int valor = 0;
    Button btnMostrar;
    EditText edtHorizontal, edtVertical, edtTexto;
    RadioButton radIzquierda, radMedio, radDerecha, radArriba, radCentro, radAbajo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_toast);
        btnMostrar = findViewById(R.id.btnMostrar);
        edtHorizontal = findViewById(R.id.edtHorizontal);
        edtVertical = findViewById(R.id.edtVertical);
        edtTexto = findViewById(R.id.edtTexto);
        radIzquierda = findViewById(R.id.radIzquierda);
        radMedio = findViewById(R.id.radMedio);
        radDerecha = findViewById(R.id.radDerecha);
        radArriba = findViewById(R.id.radArriba);
        radCentro = findViewById(R.id.radCentro);
        radAbajo = findViewById(R.id.radAbajo);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(edtHorizontal.getText().toString().isEmpty())
                {
                    edtHorizontal.setText("" + valor);
                }
                if(edtVertical.getText().toString().isEmpty())
                {
                    edtVertical.setText("" + valor);
                }
                if (!edtTexto.getText().toString().isEmpty())
                {

                    Toast toast1 = Toast.makeText(getApplicationContext(), edtTexto.getText(), Toast.LENGTH_SHORT);
                    if(radIzquierda.isChecked() && radArriba.isChecked())
                    {
                        toast1.setGravity(Gravity.LEFT|Gravity.TOP,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radIzquierda.isChecked() && radCentro.isChecked())
                    {
                        toast1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radIzquierda.isChecked() && radAbajo.isChecked())
                    {
                        toast1.setGravity(Gravity.LEFT|Gravity.BOTTOM,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radMedio.isChecked() && radArriba.isChecked())
                    {
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.TOP,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radMedio.isChecked() && radCentro.isChecked())
                    {
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radMedio.isChecked() && radAbajo.isChecked())
                    {
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radDerecha.isChecked() && radArriba.isChecked())
                    {
                        toast1.setGravity(Gravity.RIGHT|Gravity.TOP,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radDerecha.isChecked() && radCentro.isChecked())
                    {
                        toast1.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    else if(radDerecha.isChecked() && radAbajo.isChecked())
                    {
                        toast1.setGravity(Gravity.RIGHT|Gravity.BOTTOM,Integer.parseInt(edtHorizontal.getText().toString()) ,Integer.parseInt(edtVertical.getText().toString()));
                    }
                    toast1.show();
                }
                else
                {
                    edtTexto.setHint("Error escriba un texto");
                }
            }
        });
    }
}
