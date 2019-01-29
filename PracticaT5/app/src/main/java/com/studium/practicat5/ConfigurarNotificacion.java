package com.studium.practicat5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfigurarNotificacion extends AppCompatActivity {
    AppCompatActivity ConfigurarNotificacion;
    Button btnEnviar;
    EditText edtTitulo, edtMensaje, edtTiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_notificacion);
        ConfigurarNotificacion = this;
        btnEnviar = findViewById(R.id.btnEnviar);
        edtTitulo = findViewById(R.id.edtTitulo);
        edtMensaje = findViewById(R.id.edtMensaje);
        edtTiempo = findViewById(R.id.edtTiempo);
        setTitle("Configurar Notificación");

        btnEnviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder mensaje = new NotificationCompat.Builder(ConfigurarNotificacion, "CH_ID");

                Intent intent =  new Intent(ConfigurarNotificacion.this, ConfigurarNotificacion.class);

                PendingIntent contIntent =  PendingIntent.getActivity(ConfigurarNotificacion.this, 0, intent, 0);

                mensaje.setContentIntent(contIntent);

                mensaje.setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(android.R.drawable.star_on)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background))
                        .setContentText(edtTitulo.getText().toString())
                        .setContentTitle(edtMensaje.getText().toString());

                NotificationManager nM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                nM.notify(1, mensaje.build());
            }
        });
    }
}