package com.example.elizeu.clientserviceandroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by elizeu on 27/08/15.
 */
public class ProductsAdapter extends BaseAdapter {

    private List<Produtos> products;

    public ProductsAdapter(List<Produtos> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText("Nome: " + products.get(i).getNome() +
                " Valor: " + String.valueOf(products.get(i).getValor()));
        return textView;
    }
}
