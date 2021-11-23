
package com.ericsson.schemas.cai3g1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="MOType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filters" type="{http://schemas.ericsson.com/cai3g1.2/}SearchFiltersType"/>
 *         &lt;element name="extension" type="{http://schemas.ericsson.com/cai3g1.2/}AnySequenceType" minOccurs="0"/>
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
    "moType",
    "filters",
    "extension"
})
@XmlRootElement(name = "Search")
public class Search {

    @XmlElement(name = "MOType", required = true)
    protected String moType;
    @XmlElement(required = true)
    protected SearchFiltersType filters;
    protected AnySequenceType extension;

    /**
     * Gets the value of the moType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOType() {
        return moType;
    }

    /**
     * Sets the value of the moType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOType(String value) {
        this.moType = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFiltersType }
     *     
     */
    public SearchFiltersType getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFiltersType }
     *     
     */
    public void setFilters(SearchFiltersType value) {
        this.filters = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AnySequenceType }
     *     
     */
    public AnySequenceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnySequenceType }
     *     
     */
    public void setExtension(AnySequenceType value) {
        this.extension = value;
    }

}
