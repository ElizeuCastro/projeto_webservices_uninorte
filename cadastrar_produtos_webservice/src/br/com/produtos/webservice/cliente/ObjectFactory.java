
package br.com.produtos.webservice.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.produtos.webservice.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewProduto_QNAME = new QName("http://webservice.produtos.com.br/", "newProduto");
    private final static QName _NewProdutoResponse_QNAME = new QName("http://webservice.produtos.com.br/", "newProdutoResponse");
    private final static QName _GetProdutosResponse_QNAME = new QName("http://webservice.produtos.com.br/", "getProdutosResponse");
    private final static QName _GetProdutos_QNAME = new QName("http://webservice.produtos.com.br/", "getProdutos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.produtos.webservice.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProdutosResponse }
     * 
     */
    public GetProdutosResponse createGetProdutosResponse() {
        return new GetProdutosResponse();
    }

    /**
     * Create an instance of {@link GetProdutos }
     * 
     */
    public GetProdutos createGetProdutos() {
        return new GetProdutos();
    }

    /**
     * Create an instance of {@link NewProduto }
     * 
     */
    public NewProduto createNewProduto() {
        return new NewProduto();
    }

    /**
     * Create an instance of {@link NewProdutoResponse }
     * 
     */
    public NewProdutoResponse createNewProdutoResponse() {
        return new NewProdutoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.produtos.com.br/", name = "newProduto")
    public JAXBElement<NewProduto> createNewProduto(NewProduto value) {
        return new JAXBElement<NewProduto>(_NewProduto_QNAME, NewProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.produtos.com.br/", name = "newProdutoResponse")
    public JAXBElement<NewProdutoResponse> createNewProdutoResponse(NewProdutoResponse value) {
        return new JAXBElement<NewProdutoResponse>(_NewProdutoResponse_QNAME, NewProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.produtos.com.br/", name = "getProdutosResponse")
    public JAXBElement<GetProdutosResponse> createGetProdutosResponse(GetProdutosResponse value) {
        return new JAXBElement<GetProdutosResponse>(_GetProdutosResponse_QNAME, GetProdutosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.produtos.com.br/", name = "getProdutos")
    public JAXBElement<GetProdutos> createGetProdutos(GetProdutos value) {
        return new JAXBElement<GetProdutos>(_GetProdutos_QNAME, GetProdutos.class, null, value);
    }

}
