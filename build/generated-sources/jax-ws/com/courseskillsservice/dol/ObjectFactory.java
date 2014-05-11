
package com.courseskillsservice.dol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.courseskillsservice.dol package. 
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

    private final static QName _GetOccupation_QNAME = new QName("http://dol.com/", "getOccupation");
    private final static QName _GetSkill_QNAME = new QName("http://dol.com/", "getSkill");
    private final static QName _GetAllOccupations_QNAME = new QName("http://dol.com/", "getAllOccupations");
    private final static QName _GetSkillsFromOccupationResponse_QNAME = new QName("http://dol.com/", "getSkillsFromOccupationResponse");
    private final static QName _GetAllOccupationsResponse_QNAME = new QName("http://dol.com/", "getAllOccupationsResponse");
    private final static QName _GetAllSkillsResponse_QNAME = new QName("http://dol.com/", "getAllSkillsResponse");
    private final static QName _GetOccupationResponse_QNAME = new QName("http://dol.com/", "getOccupationResponse");
    private final static QName _NonexistentSkillException_QNAME = new QName("http://dol.com/", "NonexistentSkillException");
    private final static QName _GetSkillResponse_QNAME = new QName("http://dol.com/", "getSkillResponse");
    private final static QName _GetAllSkills_QNAME = new QName("http://dol.com/", "getAllSkills");
    private final static QName _GetOccupationFromSkillResponse_QNAME = new QName("http://dol.com/", "getOccupationFromSkillResponse");
    private final static QName _GetSkillsFromOccupation_QNAME = new QName("http://dol.com/", "getSkillsFromOccupation");
    private final static QName _GetOccupationFromSkill_QNAME = new QName("http://dol.com/", "getOccupationFromSkill");
    private final static QName _NonexistentOccupationException_QNAME = new QName("http://dol.com/", "NonexistentOccupationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.courseskillsservice.dol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NonexistentSkillException }
     * 
     */
    public NonexistentSkillException createNonexistentSkillException() {
        return new NonexistentSkillException();
    }

    /**
     * Create an instance of {@link GetSkillResponse }
     * 
     */
    public GetSkillResponse createGetSkillResponse() {
        return new GetSkillResponse();
    }

    /**
     * Create an instance of {@link GetAllSkills }
     * 
     */
    public GetAllSkills createGetAllSkills() {
        return new GetAllSkills();
    }

    /**
     * Create an instance of {@link GetOccupationFromSkillResponse }
     * 
     */
    public GetOccupationFromSkillResponse createGetOccupationFromSkillResponse() {
        return new GetOccupationFromSkillResponse();
    }

    /**
     * Create an instance of {@link GetOccupationResponse }
     * 
     */
    public GetOccupationResponse createGetOccupationResponse() {
        return new GetOccupationResponse();
    }

    /**
     * Create an instance of {@link NonexistentOccupationException }
     * 
     */
    public NonexistentOccupationException createNonexistentOccupationException() {
        return new NonexistentOccupationException();
    }

    /**
     * Create an instance of {@link GetSkillsFromOccupation }
     * 
     */
    public GetSkillsFromOccupation createGetSkillsFromOccupation() {
        return new GetSkillsFromOccupation();
    }

    /**
     * Create an instance of {@link GetOccupationFromSkill }
     * 
     */
    public GetOccupationFromSkill createGetOccupationFromSkill() {
        return new GetOccupationFromSkill();
    }

    /**
     * Create an instance of {@link GetOccupation }
     * 
     */
    public GetOccupation createGetOccupation() {
        return new GetOccupation();
    }

    /**
     * Create an instance of {@link GetAllOccupationsResponse }
     * 
     */
    public GetAllOccupationsResponse createGetAllOccupationsResponse() {
        return new GetAllOccupationsResponse();
    }

    /**
     * Create an instance of {@link GetAllSkillsResponse }
     * 
     */
    public GetAllSkillsResponse createGetAllSkillsResponse() {
        return new GetAllSkillsResponse();
    }

    /**
     * Create an instance of {@link GetSkillsFromOccupationResponse }
     * 
     */
    public GetSkillsFromOccupationResponse createGetSkillsFromOccupationResponse() {
        return new GetSkillsFromOccupationResponse();
    }

    /**
     * Create an instance of {@link GetAllOccupations }
     * 
     */
    public GetAllOccupations createGetAllOccupations() {
        return new GetAllOccupations();
    }

    /**
     * Create an instance of {@link GetSkill }
     * 
     */
    public GetSkill createGetSkill() {
        return new GetSkill();
    }

    /**
     * Create an instance of {@link Occupation }
     * 
     */
    public Occupation createOccupation() {
        return new Occupation();
    }

    /**
     * Create an instance of {@link Skill }
     * 
     */
    public Skill createSkill() {
        return new Skill();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getOccupation")
    public JAXBElement<GetOccupation> createGetOccupation(GetOccupation value) {
        return new JAXBElement<GetOccupation>(_GetOccupation_QNAME, GetOccupation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSkill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getSkill")
    public JAXBElement<GetSkill> createGetSkill(GetSkill value) {
        return new JAXBElement<GetSkill>(_GetSkill_QNAME, GetSkill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOccupations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getAllOccupations")
    public JAXBElement<GetAllOccupations> createGetAllOccupations(GetAllOccupations value) {
        return new JAXBElement<GetAllOccupations>(_GetAllOccupations_QNAME, GetAllOccupations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSkillsFromOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getSkillsFromOccupationResponse")
    public JAXBElement<GetSkillsFromOccupationResponse> createGetSkillsFromOccupationResponse(GetSkillsFromOccupationResponse value) {
        return new JAXBElement<GetSkillsFromOccupationResponse>(_GetSkillsFromOccupationResponse_QNAME, GetSkillsFromOccupationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOccupationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getAllOccupationsResponse")
    public JAXBElement<GetAllOccupationsResponse> createGetAllOccupationsResponse(GetAllOccupationsResponse value) {
        return new JAXBElement<GetAllOccupationsResponse>(_GetAllOccupationsResponse_QNAME, GetAllOccupationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSkillsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getAllSkillsResponse")
    public JAXBElement<GetAllSkillsResponse> createGetAllSkillsResponse(GetAllSkillsResponse value) {
        return new JAXBElement<GetAllSkillsResponse>(_GetAllSkillsResponse_QNAME, GetAllSkillsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getOccupationResponse")
    public JAXBElement<GetOccupationResponse> createGetOccupationResponse(GetOccupationResponse value) {
        return new JAXBElement<GetOccupationResponse>(_GetOccupationResponse_QNAME, GetOccupationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentSkillException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "NonexistentSkillException")
    public JAXBElement<NonexistentSkillException> createNonexistentSkillException(NonexistentSkillException value) {
        return new JAXBElement<NonexistentSkillException>(_NonexistentSkillException_QNAME, NonexistentSkillException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSkillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getSkillResponse")
    public JAXBElement<GetSkillResponse> createGetSkillResponse(GetSkillResponse value) {
        return new JAXBElement<GetSkillResponse>(_GetSkillResponse_QNAME, GetSkillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSkills }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getAllSkills")
    public JAXBElement<GetAllSkills> createGetAllSkills(GetAllSkills value) {
        return new JAXBElement<GetAllSkills>(_GetAllSkills_QNAME, GetAllSkills.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupationFromSkillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getOccupationFromSkillResponse")
    public JAXBElement<GetOccupationFromSkillResponse> createGetOccupationFromSkillResponse(GetOccupationFromSkillResponse value) {
        return new JAXBElement<GetOccupationFromSkillResponse>(_GetOccupationFromSkillResponse_QNAME, GetOccupationFromSkillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSkillsFromOccupation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getSkillsFromOccupation")
    public JAXBElement<GetSkillsFromOccupation> createGetSkillsFromOccupation(GetSkillsFromOccupation value) {
        return new JAXBElement<GetSkillsFromOccupation>(_GetSkillsFromOccupation_QNAME, GetSkillsFromOccupation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupationFromSkill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "getOccupationFromSkill")
    public JAXBElement<GetOccupationFromSkill> createGetOccupationFromSkill(GetOccupationFromSkill value) {
        return new JAXBElement<GetOccupationFromSkill>(_GetOccupationFromSkill_QNAME, GetOccupationFromSkill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentOccupationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dol.com/", name = "NonexistentOccupationException")
    public JAXBElement<NonexistentOccupationException> createNonexistentOccupationException(NonexistentOccupationException value) {
        return new JAXBElement<NonexistentOccupationException>(_NonexistentOccupationException_QNAME, NonexistentOccupationException.class, null, value);
    }

}
