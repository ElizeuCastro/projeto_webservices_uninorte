
package br.com.produtos.webservices.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CadastrarProdutosService", targetNamespace = "http://webservice.produtos.com.br/", wsdlLocation = "http://localhost:10000/cadastarProdutos?wsdl")
public class CadastrarProdutosService
    extends Service
{

    private final static URL CADASTRARPRODUTOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CADASTRARPRODUTOSSERVICE_EXCEPTION;
    private final static QName CADASTRARPRODUTOSSERVICE_QNAME = new QName("http://webservice.produtos.com.br/", "CadastrarProdutosService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10000/cadastarProdutos?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CADASTRARPRODUTOSSERVICE_WSDL_LOCATION = url;
        CADASTRARPRODUTOSSERVICE_EXCEPTION = e;
    }

    public CadastrarProdutosService() {
        super(__getWsdlLocation(), CADASTRARPRODUTOSSERVICE_QNAME);
    }

    public CadastrarProdutosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CADASTRARPRODUTOSSERVICE_QNAME, features);
    }

    public CadastrarProdutosService(URL wsdlLocation) {
        super(wsdlLocation, CADASTRARPRODUTOSSERVICE_QNAME);
    }

    public CadastrarProdutosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CADASTRARPRODUTOSSERVICE_QNAME, features);
    }

    public CadastrarProdutosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CadastrarProdutosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CadastrarProdutos
     */
    @WebEndpoint(name = "CadastrarProdutosPort")
    public CadastrarProdutos getCadastrarProdutosPort() {
        return super.getPort(new QName("http://webservice.produtos.com.br/", "CadastrarProdutosPort"), CadastrarProdutos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CadastrarProdutos
     */
    @WebEndpoint(name = "CadastrarProdutosPort")
    public CadastrarProdutos getCadastrarProdutosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.produtos.com.br/", "CadastrarProdutosPort"), CadastrarProdutos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CADASTRARPRODUTOSSERVICE_EXCEPTION!= null) {
            throw CADASTRARPRODUTOSSERVICE_EXCEPTION;
        }
        return CADASTRARPRODUTOSSERVICE_WSDL_LOCATION;
    }

}
