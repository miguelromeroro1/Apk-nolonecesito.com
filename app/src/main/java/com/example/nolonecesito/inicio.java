package com.example.nolonecesito;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void publicarArticulo(View view) {
        Intent btnPublicarArticulo = new Intent(inicio.this, particulo.class);
        startActivity(btnPublicarArticulo);
    }

    public void verArticulosPopulares(View view) {
        Intent btnArticulosPopulares = new Intent(inicio.this, apopulares.class);
        startActivity(btnArticulosPopulares);
    }

    public void verSobreNosotros(View view) {
        Intent btnPublicarArticulo = new Intent(inicio.this, sobrenosotros.class);
        startActivity(btnPublicarArticulo);
    }

    public void verContacto(View view) {
        Intent btnContacto = new Intent(inicio.this, contacto.class);
        startActivity(btnContacto);
    }
}
