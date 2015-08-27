package com.example.elizeu.clientserviceandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity implements ServiceManager.ServiceCallback {

    private ServiceManager serviceManager = new ServiceManager();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        listView = (ListView) findViewById(R.id.lv_products);
        findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serviceManager.getProducts(MainActivity.this);
            }
        });

    }

    @Override
    public void onServiceSuccess(List<Produtos> products) {
        if (products.isEmpty()){
            Toast.makeText(this, "Não há produtos registrados", Toast.LENGTH_LONG).show();
        } else {
            ProductsAdapter adapter = new ProductsAdapter(products);
            listView.setAdapter(adapter);
        }
    }

    @Override
    public void onServiceFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }
}
