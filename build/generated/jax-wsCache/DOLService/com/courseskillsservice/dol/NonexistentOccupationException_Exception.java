
package com.courseskillsservice.dol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NonexistentOccupationException", targetNamespace = "http://dol.com/")
public class NonexistentOccupationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NonexistentOccupationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NonexistentOccupationException_Exception(String message, NonexistentOccupationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NonexistentOccupationException_Exception(String message, NonexistentOccupationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.courseskillsservice.dol.NonexistentOccupationException
     */
    public NonexistentOccupationException getFaultInfo() {
        return faultInfo;
    }

}
