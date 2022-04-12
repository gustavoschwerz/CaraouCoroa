package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;
    private int contagemCara = 0, contagemCoroa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);


        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                int numero = new Random().nextInt(2);

                if ( numero == 0 ){
                    contagemCoroa++;
                }else{
                    contagemCara++;
                }

                //Passar dados para próxima tela

                intent.putExtra("num", numero);
                intent.putExtra("coroa", contagemCoroa);
                intent.putExtra("cara", contagemCara);

                startActivity(intent);

            }

        });
    }

}
