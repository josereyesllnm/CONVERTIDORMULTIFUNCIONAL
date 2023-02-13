package com.josee.Convertidor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Conver_Longitud extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    public void Volver(View View) {
        Intent miIntent = new Intent(Conver_Longitud.this, MainActivity.class);
        startActivity(miIntent);
    }

    conversor_L miConversor = new conversor_L();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conver_longitud);

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
class conversor_L{
    double[][] valores = {
            {1,0.001,100,1000,0.00062137,3.2808399,1.0936133,39.3700787,0.00053996,1000000},//Longitudes

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}
