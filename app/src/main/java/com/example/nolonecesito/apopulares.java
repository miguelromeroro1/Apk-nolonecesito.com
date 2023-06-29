package com.example.nolonecesito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class apopulares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apopulares);

        TextView txtArticulo1 = findViewById(R.id.txtArticulo1);
        TextView txtArticulo2 = findViewById(R.id.txtArticulo2);
        TextView txtArticulo3 = findViewById(R.id.txtArticulo3);

        ImageView imgArticulo1 = findViewById(R.id.imgArticulo1);
        ImageView imgArticulo2 = findViewById(R.id.imgArticulo2);
        ImageView imgArticulo3 = findViewById(R.id.imgArticulo3);

        TextView txtDescripcionArticulo1 = findViewById(R.id.txtDescripcionArticulo1);
        TextView txtDescripcionArticulo2 = findViewById(R.id.txtDescripcionArticulo2);
        TextView txtDescripcionArticulo3 = findViewById(R.id.txtDescripcionArticulo3);

        // Establecer el contenido de los artículos
        String contenidoArticulo1 = "Xbox  360";
        String contenidoArticulo2 = "Libros";
        String contenidoArticulo3 = "juegos";

        txtArticulo1.setText(contenidoArticulo1);
        txtArticulo2.setText(contenidoArticulo2);
        txtArticulo3.setText(contenidoArticulo3);

        // Establecer las imágenes de los artículos
        imgArticulo1.setImageResource(R.drawable.box);
        imgArticulo2.setImageResource(R.drawable.libros);
        imgArticulo3.setImageResource(R.drawable.juegos);

        // Establecer las descripciones de los artículos
        String descripcionArticulo1 = "El Xbox 360 es una consola de videojuegos icónica de Microsoft que revolucionó la industria. Con su potente hardware y gráficos de alta calidad, ofrece una experiencia de juego inmersiva.";
        String descripcionArticulo2 = "La producción de libros sobre videojuegos escritos en nuestro idioma sigue marcando la pauta";
        String descripcionArticulo3 = "Cds o Dvds son un disco optico para el almacenamiento digital de imagen, sonidos y datos, con mayor capacidad que un disco compacto o CD o DVD son las siglas de digital versatile disc, expresión inglesa que podemos traducir como disco disco versatil digital" ;

        txtDescripcionArticulo1.setText(descripcionArticulo1);
        txtDescripcionArticulo2.setText(descripcionArticulo2);
        txtDescripcionArticulo3.setText(descripcionArticulo3);
    }
}
