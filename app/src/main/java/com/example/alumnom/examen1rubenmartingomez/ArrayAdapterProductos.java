package com.example.alumnom.examen1rubenmartingomez;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by alumnom on 12/12/2017.
 */

public class ArrayAdapterProductos extends ArrayAdapter<Producto> {

    private Context context;
    private ArrayList<Producto> productos;

    public ArrayAdapterProductos(Context context, int resource, ArrayList<Producto> productos) {
        super(context, resource, productos);

        this.context = context;
        this.productos = productos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Producto producto = productos.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.producto_lv_activity, null);

        TextView tvNombre = (TextView) view.findViewById(R.id.tvNombre);
        TextView tvDescripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        TextView tvPrecio = (TextView) view.findViewById(R.id.tvPrecio);
        ImageView ivProducto = (ImageView) view.findViewById(R.id.ivProducto);

        tvNombre.setText(producto.getNombreProducto());
        tvDescripcion.setText(producto.getDescripcion());
        //tvPrecio.setText(Double.toString(producto.getPrecio()));
        tvPrecio.setText(producto.getPrecio()+"€");

        Glide.with(context).load(producto.getImagen()).into(ivProducto);
        return view;
    }
}
