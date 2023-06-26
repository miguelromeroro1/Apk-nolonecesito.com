package com.example.nolonecesito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class contacto extends AppCompatActivity {

    private EditText etNombre;
    private EditText etCorreo;
    private EditText etMensaje;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        etMensaje = findViewById(R.id.etMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString().trim();
                String correo = etCorreo.getText().toString().trim();
                String mensaje = etMensaje.getText().toString().trim();

                if (!nombre.isEmpty() && !correo.isEmpty() && !mensaje.isEmpty()) {
                    // Aquí puedes implementar la lógica para enviar el mensaje de contacto
                    Toast.makeText(contacto.this, "Pronto nos pondremos en contacto con usted", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(contacto.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
