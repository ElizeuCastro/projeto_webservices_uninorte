package com.example.elizeu.clientserviceandroid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity implements ServiceManager.ServiceCallback {

    private ServiceManager serviceManager = new ServiceManager();
    private ListView listView;
    private EditText edtIp;
    private Button btnRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        listView = (ListView) findViewById(R.id.lv_products);
        edtIp = (EditText) findViewById(R.id.edt_ip);
        btnRefresh = (Button) findViewById(R.id.btn_refresh);

        edtIp.setText(getLastIp());

        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String serverIp = edtIp.getText().toString().trim();
                if (!serverIp.isEmpty()) {
                    saveLastIp(serverIp);
                    serviceManager.setServerIp(serverIp);
                    serviceManager.getProducts(MainActivity.this);
                }
            }
        });
    }

    private String getLastIp() {
        SharedPreferences preferences = getSharedPreferences("CLIENT_ANDROID", 0);
        String lastIP = preferences.getString("LAST_IP", "");
        return lastIP;
    }

    private void saveLastIp(String serverIp){
        SharedPreferences preferences = getSharedPreferences("CLIENT_ANDROID", 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("LAST_IP", serverIp).commit();
    }

    @Override
    public void onServiceSuccess(List<Produtos> products) {
        ProductsAdapter adapter = new ProductsAdapter(products);
        listView.setAdapter(adapter);
        if (products.isEmpty()) {
            Toast.makeText(this, "Não há produtos registrados", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onServiceFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }
}
