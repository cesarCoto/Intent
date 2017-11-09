package com.robot.maker.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // se deben declarar como varibles globales. para que se puedan tomar los datos.
    EditText editTextname,editTextedad,editTextocupacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        editTextname = findViewById(R.id.editText_name);
        editTextedad = findViewById(R.id.editText_edad);
        editTextocupacion = findViewById(R.id.editText_ocupacion);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }
    private void action(){
        String datos = editTextname.getText().toString() + "\n"+
                editTextedad.getText().toString() + "\n" + editTextocupacion.getText().toString();

        // se crea un intent en este se mandan los datos.
        Intent i = new Intent(this,DatosActivity.class);
        i.putExtra("DatosDelUsuario",datos);
        // se inicia la otra actividad
        startActivity(i);
    }
}
