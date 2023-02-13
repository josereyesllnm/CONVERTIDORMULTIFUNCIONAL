package com.josee.Convertidor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Conver_Masa extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    public void Volver(View View) {
        Intent miIntent = new Intent(Conver_Masa.this, MainActivity.class);
        startActivity(miIntent);
    }
    conversor_M miConversor = new conversor_M();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conver_masa);

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
class conversor_M {
    double[][] valores = {
            {1,0.453592,453.59,453592,16,4.536,0.07,45.36,0.000454},//Masa
    };

    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}