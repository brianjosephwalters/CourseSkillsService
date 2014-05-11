
package com.courseskillsservice.dol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSkillsFromOccupation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSkillsFromOccupation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="occupationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSkillsFromOccupation", propOrder = {
    "occupationID"
})
public class GetSkillsFromOccupation {

    protected String occupationID;

    /**
     * Gets the value of the occupationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationID() {
        return occupationID;
    }

    /**
     * Sets the value of the occupationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationID(String value) {
        this.occupationID = value;
    }

}
