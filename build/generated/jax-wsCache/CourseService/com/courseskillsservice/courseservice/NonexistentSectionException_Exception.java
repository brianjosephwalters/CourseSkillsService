
package com.courseskillsservice.courseservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NonexistentSectionException", targetNamespace = "http://courseservice.com/")
public class NonexistentSectionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NonexistentSectionException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NonexistentSectionException_Exception(String message, NonexistentSectionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NonexistentSectionException_Exception(String message, NonexistentSectionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.courseskillsservice.courseservice.NonexistentSectionException
     */
    public NonexistentSectionException getFaultInfo() {
        return faultInfo;
    }

}
