
package com.courseskillsservice.dol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOccupationFromSkill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOccupationFromSkill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOccupationFromSkill", propOrder = {
    "skillID"
})
public class GetOccupationFromSkill {

    protected String skillID;

    /**
     * Gets the value of the skillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillID() {
        return skillID;
    }

    /**
     * Sets the value of the skillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillID(String value) {
        this.skillID = value;
    }

}
