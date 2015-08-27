package com.example.elizeu.clientserviceandroid;

import android.os.AsyncTask;

import com.thoughtworks.xstream.XStream;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.List;

/**
 * Created by elizeu on 27/08/15.
 */
public class ServiceManager {

    public interface ServiceCallback {

        void onServiceSuccess(List<Produtos> products);

        void onServiceFail(String error);

    }

    private static final String NAMESPACE = "http://webservice.produtos.com.br/";
    private static String URL = "http://192.168.1.13:8080/cadastrarProdutos?wsdl";
    private static final String METHOD_NAME = "getProdutos";
    private static final String SOAP_ACTION = "http://webservice.produtos.com.br/getProdutos";

    public void getProducts(final ServiceCallback serviceCallback) {
        new AsyncTask<Void, Void, List<Produtos>>() {

            String error = "";

            @Override
            protected List<Produtos> doInBackground(Void... voids) {
                List<Produtos> products = null;
                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                envelope.setOutputSoapObject(request);
                HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
                try {
                    androidHttpTransport.call(SOAP_ACTION, envelope);
                    SoapPrimitive resultsRequestSOAP = (SoapPrimitive) envelope.getResponse();
                    XStream xstream = new XStream();
                    xstream.alias(Produtos.class.getSimpleName(), Produtos.class);
                    products = (List<Produtos>) xstream.fromXML(resultsRequestSOAP.toString());
                } catch (Exception e) {
                    error = e.getMessage();
                }
                return products;
            }

            @Override
            protected void onPostExecute(List<Produtos> products) {
                if (products != null) {
                    serviceCallback.onServiceSuccess(products);
                } else {
                    serviceCallback.onServiceFail(error);
                }
            }
        }.execute();
    }

}
