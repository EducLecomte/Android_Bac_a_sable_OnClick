package com.bas.bac_a_sable_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // attribut
    Integer compteur=0;
    Integer compteurLong=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        ecouteBtnClic();

    }



    private void ecouteBtnClic() {

        Button btn1 = findViewById(R.id.btn_clic);
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur++;
                TextView tvlabel = findViewById(R.id.tv_clicCourt);
                tvlabel.setText("Nombre de clic court : "+compteur);

            }
        });

        btn1.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                compteurLong++;
                TextView tvlabel = findViewById(R.id.tv_clicLong);
                tvlabel.setText("Nombre de clic long : "+compteurLong);
                // si effectue un clic court en plus du long
                //return false;
                // si ne'effectue pas de clic court en plus du long
                return true;
            }
        });


    }


}
