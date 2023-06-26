package com.example.nolonecesito;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inicializar vista
        usernameEditText = findViewById(R.id.usernameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        registerButton = findViewById(R.id.registerButton);

        // Acción del botón de registro
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validar los datos ingresados
                if (isValidData(username, email, password)) {
                    // Procesar el registro (ejemplo: guardar en la base de datos)
                    registerUser(username, email, password);
                } else {
                    Toast.makeText(register.this, "Por favor, ingresa todos los datos.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidData(String username, String email, String password) {
        return !TextUtils.isEmpty(username) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password);
    }

    private void registerUser(String username, String email, String password) {
        // Aquí puedes implementar la lógica para registrar al usuario
        // (ejemplo: guardar en la base de datos, enviar solicitud al servidor, etc.)
        // Puedes personalizar esta función según tus necesidades.
        // Por ahora, simplemente mostraremos un mensaje de registro exitoso.
        Toast.makeText(this, "Registro exitoso. ¡Bienvenido, " + username + "!", Toast.LENGTH_SHORT).show();
    }
}
