package com.example.tp2conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCambiar;
    private EditText edtDolares;
    private EditText edtEuros;
    private RadioButton rdbDolares;
    private RadioButton rdbEuros;
    private Button btnConvertir;
    private TextView euroValor;
    double dolar = 0.91;
    double euro = 1.10;
    double convertido;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCambiar=findViewById(R.id.buttonCambiar);
        edtDolares=findViewById(R.id.editDolares);
        edtEuros=findViewById(R.id.editEuros);
        rdbDolares=findViewById(R.id.radioDolar);
        rdbEuros=findViewById(R.id.radioEuros);
        btnConvertir=findViewById(R.id.buttonConvertir);


        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdbDolares.isChecked()){
                    if(!edtEuros.getText().toString().equals("")){
                       double valorE=Double.parseDouble(edtEuros.getText().toString());
                        convertido=valorE*dolar;
                        String valor= String.valueOf(convertido);
                        edtDolares.setText(valor);
                    }else{
                        Toast.makeText(getApplicationContext(),"ingrese un valor para convertir", Toast.LENGTH_LONG).show();
                    }
                }
                if(rdbEuros.isChecked()){
                    if(!edtDolares.getText().toString().equals("")) {
                        double valorD=Double.parseDouble(edtDolares.getText().toString());
                        convertido=valorD*euro;
                        String valor= String.valueOf(convertido);
                        edtEuros.setText(valor);
                    }else{
                        Toast.makeText(getApplicationContext(),"ingrese un valor para convertir", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        /*btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i= new Intent(getApplicationContext(), CambiarValor.class);
                startActivity(i);
            }
        });*/


    }
}
