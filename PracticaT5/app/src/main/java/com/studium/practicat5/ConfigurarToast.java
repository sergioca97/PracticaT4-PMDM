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

    Button btnMostrar;
    EditText edtHorizontal, edtVertical, edtTexto;
    RadioGroup rndHorizontal, rndVertical;
    RadioButton radIzquierda, radMedio, radDerecha, radArriba, radCentro, radAbajo;
    int numero = 0;
    Boolean seleccionar = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_toast);

        btnMostrar = findViewById(R.id.btnMostrar);
        edtHorizontal = findViewById(R.id.edtHorizontal);
        edtVertical = findViewById(R.id.edtVertical);
        edtTexto = findViewById(R.id.edtTexto);
        rndHorizontal = findViewById(R.id.rndHorizontal);
        radIzquierda = findViewById(R.id.radIzquierda);
        radMedio = findViewById(R.id.radMedio);
        radDerecha = findViewById(R.id.radDerecha);
        rndVertical = findViewById(R.id.rndVertical);
        radArriba = findViewById(R.id.radArriba);
        radCentro = findViewById(R.id.radCentro);
        radAbajo = findViewById(R.id.radAbajo);

        final Toast toast = Toast.makeText(getApplicationContext(), edtTexto.getText(), Toast.LENGTH_SHORT);
        rndHorizontal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (radIzquierda.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radIzquierda.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radIzquierda.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                }
                toast.show();
            }


            });
        rndVertical.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (radIzquierda.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radIzquierda.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radIzquierda.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.LEFT | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radMedio.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radArriba.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.TOP, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radCentro.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                } else if (radDerecha.isChecked() && radAbajo.isChecked()) {
                    toast.setGravity(Gravity.RIGHT | Gravity.BOTTOM, Integer.parseInt(edtHorizontal.getText().toString()), Integer.parseInt(edtVertical.getText().toString()));
                }
                toast.show();
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (!edtTexto.getText().toString().isEmpty())
                {
                    if(edtHorizontal.getText().toString().isEmpty())
                    {
                        edtHorizontal.setText("" +numero);
                    }
                    if(edtVertical.getText().toString().isEmpty())
                    {
                        edtVertical.setText("" +numero);
                    }
                    Toast toast1 = Toast.makeText(getApplicationContext(), edtTexto.getText(), Toast.LENGTH_SHORT);
            }
            }
        });
    }
}
