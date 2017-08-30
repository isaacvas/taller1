package com.example.android.calsadozxy;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class CalsadoZXY extends AppCompatActivity {
    private EditText cant, valor;
    private Resources resources;
    private Spinner sexo, tipo, marca;
    private String se[], ti[], mar[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calsado_zxy);

        cant =(EditText)findViewById(R.id.txtCantidad);
        valor =(EditText)findViewById(R.id.lblValor);
         sexo =(Spinner)findViewById(R.id.cmdSexo);
        marca =(Spinner)findViewById(R.id.cmdMarca);
        tipo =(Spinner)findViewById(R.id.cmdTipo);
        resources = this.getResources();
        se = resources.getStringArray(R.array.sexo);
        mar = resources.getStringArray(R.array.marca);
        ti = resources.getStringArray(R.array.tipo_zapatos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,se);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mar);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ti);
        sexo.setAdapter(adapter);
        tipo.setAdapter(adapter2);
        marca.setAdapter(adapter3);

    }


    public boolean validar(){
        int posicion1 = sexo.getSelectedItemPosition();
        int posicion2 = tipo.getSelectedItemPosition();
        int posicion3 = marca.getSelectedItemPosition();
        if (cant.getText().toString().isEmpty()){
            cant.setError(resources.getString(R.string.mensaje_error_uno));
            return false;
        }
        return true;
    }

    public void calcular (View v){

    }
}