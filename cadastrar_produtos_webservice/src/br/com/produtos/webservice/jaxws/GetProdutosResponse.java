
package br.com.produtos.webservice.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProdutosResponse", namespace = "http://webservice.produtos.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProdutosResponse", namespace = "http://webservice.produtos.com.br/")
public class GetProdutosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<br.com.produtos.webservice.modelo.Produtos> _return;

    /**
     * 
     * @return
     *     returns List<Produtos>
     */
    public List<br.com.produtos.webservice.modelo.Produtos> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<br.com.produtos.webservice.modelo.Produtos> _return) {
        this._return = _return;
    }

}
