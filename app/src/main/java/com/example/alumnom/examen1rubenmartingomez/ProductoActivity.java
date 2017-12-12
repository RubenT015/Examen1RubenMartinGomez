package com.example.alumnom.examen1rubenmartingomez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ProductoActivity extends AppCompatActivity {
    Producto producto;
    TextView tvNombre, tvDescripcion, tvPrecio,tvCodigo;
    ImageView ivGaleria, ivSiguiente, ivAnterior;
    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        Bundle bundle = getIntent().getExtras();
        producto=(Producto) bundle.get("producto");
        posicion = 0;

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        tvPrecio = (TextView) findViewById(R.id.tvPrecio);
        tvCodigo = (TextView) findViewById(R.id.tvCodigo);
        ivGaleria = (ImageView) findViewById(R.id.ivGaleria);
        cargarDatos();

        //Glide.with(this).load(R.drawable.back).into(ivAnterior);
        //Glide.with(this).load(R.drawable.forward).into(ivSiguiente);
    }

    public void botonAnterior(View v){
        anterior();
    }

    public void botonSiguiente(View v){
        siguiente();
    }
    private void anterior(){
        posicion = (posicion == 0)?producto.getGaleriaImagenes().length-1:posicion-1;
        cargarImagenGaleria();

    }

    private void siguiente(){
        posicion = (posicion >= producto.getGaleriaImagenes().length-1)?0:posicion+1;
        cargarImagenGaleria();
    }

    private void cargarDatos(){
        tvNombre.setText(producto.getNombreProducto());
        tvDescripcion.setText(producto.getDescripcion());
        tvPrecio.setText(producto.getPrecio()+"€");
        tvCodigo.setText("Codigo de producto:"+producto.getIdProducto());
        cargarImagenGaleria();
    }

    private void cargarImagenGaleria(){
        Glide.with(this).load(producto.getGaleriaImagenes()[posicion]).into(ivGaleria);
        Toast aviso=Toast.makeText(this,"imagen posicion "+posicion,Toast.LENGTH_SHORT);
        aviso.show();
    }
}
