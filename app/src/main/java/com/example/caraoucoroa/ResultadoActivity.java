package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    private TextView textCara, textCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        textCara = findViewById(R.id.textCara);
        textCoroa = findViewById(R.id.textCoroa);


        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        //recuperar dados

        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("num");
        if (numero == 0){
            imageResultado.setImageResource( R.drawable.moeda_coroa );
        }else if (numero == 1) {
            imageResultado.setImageResource( R.drawable.moeda_cara );
        }

        int contCara = dados.getInt("cara");
        String cara = String.valueOf(contCara);
        textCara.setText(cara);

        int contCoroa = dados.getInt("coroa");
        String coroa = String.valueOf(contCoroa);
        textCoroa.setText(coroa);



        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

    }
}