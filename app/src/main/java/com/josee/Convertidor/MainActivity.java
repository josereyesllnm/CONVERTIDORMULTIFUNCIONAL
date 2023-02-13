package com.josee.Convertidor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.josee.Convertidor.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrir_monedas(View View){
        Intent miIntent=new Intent(MainActivity.this,Conver_Monedas.class);
        startActivity(miIntent);

    }

    public void masa(View view){
        Intent intent = new Intent(MainActivity.this,Conver_Masa.class);
        startActivity(intent);

    }

    public void abrir_volumen(View view){
        Intent intent = new Intent(MainActivity.this,Conver_Volumen.class);
        startActivity(intent);

    }

    public void abrir_tiempo(View view){
        Intent intent = new Intent(MainActivity.this,Conver_Tiempo.class);
        startActivity(intent);

    }

    public void abrir_longitud(View view) {
        Intent intent = new Intent(MainActivity.this, Conver_Longitud.class);
        startActivity(intent);
    }

    public void abrir_almacenamiento(View view) {
        Intent intent = new Intent(MainActivity.this, Conver_Almacenamiento.class);
        startActivity(intent);
    }

    public void abrir_transfer(View view) {
        Intent intent = new Intent(MainActivity.this, Conver_TransferData.class);
        startActivity(intent);
    }


}