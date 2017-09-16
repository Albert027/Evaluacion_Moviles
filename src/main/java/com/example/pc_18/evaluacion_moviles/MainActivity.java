package com.example.pc_18.evaluacion_moviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button NewEst;
    public static String Nombre;
    public static String Codigo;
    public static String Materia;
    public static String Parcial1;
    public static String Parcial2;
    public static String Parcial3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewEst = (Button) findViewById(R.id.NuevoEstudiante);
        NewEst.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nuevo = new Intent(MainActivity.this,EstudianteActivity.class);
                startActivity(Nuevo);
            }
        });
    }
}
