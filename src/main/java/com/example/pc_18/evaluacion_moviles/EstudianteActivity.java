package com.example.pc_18.evaluacion_moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EstudianteActivity extends AppCompatActivity {

    private Button Guardando;
    private TextView Name;
    private TextView Code;
    private TextView Mate;
    private TextView Par1;
    private TextView Par2;
    private TextView Par3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        Guardando = (Button) findViewById(R.id.Guardar);
        Name = (TextView) findViewById(R.id.NombreEst);
        Code = (TextView) findViewById(R.id.CodigoEst);
        Mate = (TextView) findViewById(R.id.MateriaEst);
        Par1 = (TextView) findViewById(R.id.PrimerParcial);
        Par2 = (TextView) findViewById(R.id.SegundoParcial);
        Par3 = (TextView) findViewById(R.id.TercerParcial);

        Guardando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.Nombre = Name.getText().toString();
                MainActivity.Codigo = Code.getText().toString();
                MainActivity.Materia = Mate.getText().toString();
                MainActivity.Parcial1 = Par1.getText().toString();
                MainActivity.Parcial2 = Par2.getText().toString();
                MainActivity.Parcial3 = Par3.getText().toString();
            }
        });
    }
}
