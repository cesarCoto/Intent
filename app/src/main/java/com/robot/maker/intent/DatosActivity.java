package com.robot.maker.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    TextView textView_datos;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        button = findViewById(R.id.button_atras);

        textView_datos = findViewById(R.id.textView_datos);
        // este es donde se lee si el usuario a mandado datos.
        Bundle bundle = getIntent().getExtras();
        // aqui es donde se recuperan los datos del usuario
        String datos_act = bundle.getString("DatosDelUsuario");
        //se asignan los datos que el usuario a ingresado a el TextView.
        textView_datos.setText(datos_act);
        // ya probe la app si funciona

        //ahora para el button de regreso.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //solo se pone finish
                finish();
                // ya funciona.
            }
        });
    }
}
