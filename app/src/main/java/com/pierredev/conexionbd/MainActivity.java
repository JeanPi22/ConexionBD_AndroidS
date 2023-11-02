package com.pierredev.conexionbd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCrear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       Instanciamos Boton para crear base de datos

        btnCrear = findViewById(R.id.btnCrear);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConexionSQLite conexionSQLite = new ConexionSQLite((MainActivity.this));
                SQLiteDatabase db = conexionSQLite.getWritableDatabase();
                if(db != null){
                    Toast.makeText(MainActivity.this,"Base de Datos Creada", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Error al crear la Datos Creada", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}