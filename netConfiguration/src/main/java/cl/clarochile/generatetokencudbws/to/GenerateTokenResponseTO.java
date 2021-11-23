
package cl.clarochile.generatetokencudbws.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateTokenResponseTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateTokenResponseTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateTokenResponseTO", propOrder = {
    "codeError",
    "messageError",
    "token"
})
public class GenerateTokenResponseTO {

    protected int codeError;
    @XmlElement(required = true)
    protected String messageError;
    @XmlElement(required = true)
    protected String token;

    /**
     * Gets the value of the codeError property.
     * 
     */
    public int getCodeError() {
        return codeError;
    }

    /**
     * Sets the value of the codeError property.
     * 
     */
    public void setCodeError(int value) {
        this.codeError = value;
    }

    /**
     * Gets the value of the messageError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageError() {
        return messageError;
    }

    /**
     * Sets the value of the messageError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageError(String value) {
        this.messageError = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
