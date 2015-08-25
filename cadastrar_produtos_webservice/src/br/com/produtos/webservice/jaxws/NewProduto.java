
package br.com.produtos.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "newProduto", namespace = "http://webservice.produtos.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newProduto", namespace = "http://webservice.produtos.com.br/", propOrder = {
    "nome",
    "valor"
})
public class NewProduto {

    @XmlElement(name = "nome", namespace = "")
    private String nome;
    @XmlElement(name = "valor", namespace = "")
    private Double valor;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * 
     * @param nome
     *     the value for the nome property
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return
     *     returns Double
     */
    public Double getValor() {
        return this.valor;
    }

    /**
     * 
     * @param valor
     *     the value for the valor property
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

}
