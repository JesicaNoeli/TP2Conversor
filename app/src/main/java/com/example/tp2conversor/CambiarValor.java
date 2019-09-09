package com.example.tp2conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CambiarValor extends AppCompatActivity {
    private Button btnGuardar;
    private EditText edtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_valor);
        btnGuardar=findViewById(R.id.buttonGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           if(!edtValor.getText().toString().equals("")){
               Intent i= new Intent(getApplicationContext(), MainActivity.class);
               i.putExtra("euro",edtValor.getText().toString());
               startActivity(i);
           }else{
               Toast.makeText(getApplicationContext(),"ingrese un valor para guardar", Toast.LENGTH_LONG).show();
           }
            }
        });
    }
}
