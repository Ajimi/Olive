package com.example.khalyl.olive;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by selim on 5/14/2017.
 */

public class ProductAdapter extends ArrayAdapter<ProductData> {
    public ProductAdapter(@NonNull Context context, ArrayList<ProductData> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ProductData data = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.product_item, parent, false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView name = (TextView) convertView.findViewById(R.id.title_produit);
        TextView price = (TextView) convertView.findViewById(R.id.price_produit);

        img.setImageResource(data.getmImage());
        Log.v("SSS", data.getmImage()+"");
        name.setText(data.getName());
        price.setText(data.getPrice());

        return convertView;
    }
}
