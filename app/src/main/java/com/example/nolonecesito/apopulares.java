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
        String contenidoArticulo1 = "Nintendo 64";
        String contenidoArticulo2 = "Libros retro";
        String contenidoArticulo3 = "DVDs y CDs";

        txtArticulo1.setText(contenidoArticulo1);
        txtArticulo2.setText(contenidoArticulo2);
        txtArticulo3.setText(contenidoArticulo3);

        // Establecer las imágenes de los artículos
        imgArticulo1.setImageResource(R.drawable.nintendo);
        imgArticulo2.setImageResource(R.drawable.librosretro);
        imgArticulo3.setImageResource(R.drawable.dvdsjuegos);

        // Establecer las descripciones de los artículos
        String descripcionArticulo1 = "Una videoconsola o consola de videojuegos es un sistema electrónico de entretenimiento que ejecuta videojuegos contenidos en cartuchos, discos ópticos, discos magnéticos, tarjetas de memoria o en cualquier dispotivo de almacenamiento";
        String descripcionArticulo2 = "Obre cientifica, literaria o de cualquier otra índole con extensión suficiente para formar volumen, que puede aparecer impresa o en otro soporte";
        String descripcionArticulo3 = "Cds o Dvds son un disco optico para el almacenamiento digital de imagen, sonidos y datos, con mayor capacidad que un disco compacto o CD o DVD son las siglas de digital versatile disc, expresión inglesa que podemos traducir como disco disco versatil digital" ;

        txtDescripcionArticulo1.setText(descripcionArticulo1);
        txtDescripcionArticulo2.setText(descripcionArticulo2);
        txtDescripcionArticulo3.setText(descripcionArticulo3);
    }
}
