package com.josee.Convertidor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Conver_Volumen extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    public void Volver(View View) {
        Intent miIntent = new Intent(Conver_Volumen.this, MainActivity.class);
        startActivity(miIntent);
    }
    conversor_V miConversor = new conversor_V();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conver_volumen);

        btn = findViewById(R.id.btnConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());

                spn = findViewById(R.id.spnde);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spna);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblRespuesta);
                temp.setText("Respuesta: " + miConversor.convertir(0, de, a, cantidad));

            }
        });

    }

}
class conversor_V {
    double[][] valores = {
            {1,1000,1.56,4.16667,33.814,3.785,2.11338,67.628},//Volumen
    };

    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}
