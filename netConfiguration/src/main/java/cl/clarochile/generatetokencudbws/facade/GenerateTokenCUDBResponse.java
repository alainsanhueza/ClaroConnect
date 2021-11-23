
package cl.clarochile.generatetokencudbws.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cl.clarochile.generatetokencudbws.to.GenerateTokenResponseTO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generateTokenCUDBiParamOut" type="{http://to.generatetokencudbws.clarochile.cl}GenerateTokenResponseTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generateTokenCUDBiParamOut"
})
@XmlRootElement(name = "generateTokenCUDBResponse")
public class GenerateTokenCUDBResponse {

    @XmlElement(required = true, nillable = true)
    protected GenerateTokenResponseTO generateTokenCUDBiParamOut;

    /**
     * Gets the value of the generateTokenCUDBiParamOut property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateTokenResponseTO }
     *     
     */
    public GenerateTokenResponseTO getGenerateTokenCUDBiParamOut() {
        return generateTokenCUDBiParamOut;
    }

    /**
     * Sets the value of the generateTokenCUDBiParamOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateTokenResponseTO }
     *     
     */
    public void setGenerateTokenCUDBiParamOut(GenerateTokenResponseTO value) {
        this.generateTokenCUDBiParamOut = value;
    }

}
