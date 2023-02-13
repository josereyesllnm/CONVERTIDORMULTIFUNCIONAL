package com.josee.Convertidor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Conver_TransferData extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    public void Volver(View View) {
        Intent miIntent = new Intent(Conver_TransferData.this, MainActivity.class);
        startActivity(miIntent);
    }

    conversor_TD miConversor = new conversor_TD();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conver_transferdata);

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
class conversor_TD{
    double[][] valores = {
            {1,0.001,0.000125,0.000976563,1e-6,1.25e-7,9.5367e-7,1e-9,1.25e-10,1.25e-13},//Transferencia de Datos
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}
