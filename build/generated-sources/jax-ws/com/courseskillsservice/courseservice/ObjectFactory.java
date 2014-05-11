
package com.courseskillsservice.courseservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.courseskillsservice.courseservice package. 
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

    private final static QName _GetInactiveCoursesResponse_QNAME = new QName("http://courseservice.com/", "getInactiveCoursesResponse");
    private final static QName _GetCourse_QNAME = new QName("http://courseservice.com/", "getCourse");
    private final static QName _GetInactiveCourses_QNAME = new QName("http://courseservice.com/", "getInactiveCourses");
    private final static QName _GetCourseSkillCodesResponse_QNAME = new QName("http://courseservice.com/", "getCourseSkillCodesResponse");
    private final static QName _GetCourseResponse_QNAME = new QName("http://courseservice.com/", "getCourseResponse");
    private final static QName _GetSectionResponse_QNAME = new QName("http://courseservice.com/", "getSectionResponse");
    private final static QName _GetActiveCoursesResponse_QNAME = new QName("http://courseservice.com/", "getActiveCoursesResponse");
    private final static QName _GetAllCurrentSectionsOfCourseResponse_QNAME = new QName("http://courseservice.com/", "getAllCurrentSectionsOfCourseResponse");
    private final static QName _GetSection_QNAME = new QName("http://courseservice.com/", "getSection");
    private final static QName _NonexistentCourseException_QNAME = new QName("http://courseservice.com/", "NonexistentCourseException");
    private final static QName _GetAllCoursesResponse_QNAME = new QName("http://courseservice.com/", "getAllCoursesResponse");
    private final static QName _GetActiveCourses_QNAME = new QName("http://courseservice.com/", "getActiveCourses");
    private final static QName _GetAllSectionsOfCourseResponse_QNAME = new QName("http://courseservice.com/", "getAllSectionsOfCourseResponse");
    private final static QName _GetAllCurrentSectionsOfCourse_QNAME = new QName("http://courseservice.com/", "getAllCurrentSectionsOfCourse");
    private final static QName _NonexistentSectionException_QNAME = new QName("http://courseservice.com/", "NonexistentSectionException");
    private final static QName _GetAllSectionsOfCourse_QNAME = new QName("http://courseservice.com/", "getAllSectionsOfCourse");
    private final static QName _GetCourseSkillCodes_QNAME = new QName("http://courseservice.com/", "getCourseSkillCodes");
    private final static QName _GetAllCourses_QNAME = new QName("http://courseservice.com/", "getAllCourses");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.courseskillsservice.courseservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseSkillCodesResponse }
     * 
     */
    public GetCourseSkillCodesResponse createGetCourseSkillCodesResponse() {
        return new GetCourseSkillCodesResponse();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link GetInactiveCourses }
     * 
     */
    public GetInactiveCourses createGetInactiveCourses() {
        return new GetInactiveCourses();
    }

    /**
     * Create an instance of {@link GetInactiveCoursesResponse }
     * 
     */
    public GetInactiveCoursesResponse createGetInactiveCoursesResponse() {
        return new GetInactiveCoursesResponse();
    }

    /**
     * Create an instance of {@link GetAllCurrentSectionsOfCourseResponse }
     * 
     */
    public GetAllCurrentSectionsOfCourseResponse createGetAllCurrentSectionsOfCourseResponse() {
        return new GetAllCurrentSectionsOfCourseResponse();
    }

    /**
     * Create an instance of {@link GetSectionResponse }
     * 
     */
    public GetSectionResponse createGetSectionResponse() {
        return new GetSectionResponse();
    }

    /**
     * Create an instance of {@link GetActiveCoursesResponse }
     * 
     */
    public GetActiveCoursesResponse createGetActiveCoursesResponse() {
        return new GetActiveCoursesResponse();
    }

    /**
     * Create an instance of {@link GetAllCoursesResponse }
     * 
     */
    public GetAllCoursesResponse createGetAllCoursesResponse() {
        return new GetAllCoursesResponse();
    }

    /**
     * Create an instance of {@link NonexistentCourseException }
     * 
     */
    public NonexistentCourseException createNonexistentCourseException() {
        return new NonexistentCourseException();
    }

    /**
     * Create an instance of {@link GetSection }
     * 
     */
    public GetSection createGetSection() {
        return new GetSection();
    }

    /**
     * Create an instance of {@link GetAllCourses }
     * 
     */
    public GetAllCourses createGetAllCourses() {
        return new GetAllCourses();
    }

    /**
     * Create an instance of {@link GetCourseSkillCodes }
     * 
     */
    public GetCourseSkillCodes createGetCourseSkillCodes() {
        return new GetCourseSkillCodes();
    }

    /**
     * Create an instance of {@link GetAllSectionsOfCourse }
     * 
     */
    public GetAllSectionsOfCourse createGetAllSectionsOfCourse() {
        return new GetAllSectionsOfCourse();
    }

    /**
     * Create an instance of {@link GetAllCurrentSectionsOfCourse }
     * 
     */
    public GetAllCurrentSectionsOfCourse createGetAllCurrentSectionsOfCourse() {
        return new GetAllCurrentSectionsOfCourse();
    }

    /**
     * Create an instance of {@link GetAllSectionsOfCourseResponse }
     * 
     */
    public GetAllSectionsOfCourseResponse createGetAllSectionsOfCourseResponse() {
        return new GetAllSectionsOfCourseResponse();
    }

    /**
     * Create an instance of {@link NonexistentSectionException }
     * 
     */
    public NonexistentSectionException createNonexistentSectionException() {
        return new NonexistentSectionException();
    }

    /**
     * Create an instance of {@link GetActiveCourses }
     * 
     */
    public GetActiveCourses createGetActiveCourses() {
        return new GetActiveCourses();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getInactiveCoursesResponse")
    public JAXBElement<GetInactiveCoursesResponse> createGetInactiveCoursesResponse(GetInactiveCoursesResponse value) {
        return new JAXBElement<GetInactiveCoursesResponse>(_GetInactiveCoursesResponse_QNAME, GetInactiveCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getCourse")
    public JAXBElement<GetCourse> createGetCourse(GetCourse value) {
        return new JAXBElement<GetCourse>(_GetCourse_QNAME, GetCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getInactiveCourses")
    public JAXBElement<GetInactiveCourses> createGetInactiveCourses(GetInactiveCourses value) {
        return new JAXBElement<GetInactiveCourses>(_GetInactiveCourses_QNAME, GetInactiveCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseSkillCodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getCourseSkillCodesResponse")
    public JAXBElement<GetCourseSkillCodesResponse> createGetCourseSkillCodesResponse(GetCourseSkillCodesResponse value) {
        return new JAXBElement<GetCourseSkillCodesResponse>(_GetCourseSkillCodesResponse_QNAME, GetCourseSkillCodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getSectionResponse")
    public JAXBElement<GetSectionResponse> createGetSectionResponse(GetSectionResponse value) {
        return new JAXBElement<GetSectionResponse>(_GetSectionResponse_QNAME, GetSectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getActiveCoursesResponse")
    public JAXBElement<GetActiveCoursesResponse> createGetActiveCoursesResponse(GetActiveCoursesResponse value) {
        return new JAXBElement<GetActiveCoursesResponse>(_GetActiveCoursesResponse_QNAME, GetActiveCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrentSectionsOfCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllCurrentSectionsOfCourseResponse")
    public JAXBElement<GetAllCurrentSectionsOfCourseResponse> createGetAllCurrentSectionsOfCourseResponse(GetAllCurrentSectionsOfCourseResponse value) {
        return new JAXBElement<GetAllCurrentSectionsOfCourseResponse>(_GetAllCurrentSectionsOfCourseResponse_QNAME, GetAllCurrentSectionsOfCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getSection")
    public JAXBElement<GetSection> createGetSection(GetSection value) {
        return new JAXBElement<GetSection>(_GetSection_QNAME, GetSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentCourseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "NonexistentCourseException")
    public JAXBElement<NonexistentCourseException> createNonexistentCourseException(NonexistentCourseException value) {
        return new JAXBElement<NonexistentCourseException>(_NonexistentCourseException_QNAME, NonexistentCourseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllCoursesResponse")
    public JAXBElement<GetAllCoursesResponse> createGetAllCoursesResponse(GetAllCoursesResponse value) {
        return new JAXBElement<GetAllCoursesResponse>(_GetAllCoursesResponse_QNAME, GetAllCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getActiveCourses")
    public JAXBElement<GetActiveCourses> createGetActiveCourses(GetActiveCourses value) {
        return new JAXBElement<GetActiveCourses>(_GetActiveCourses_QNAME, GetActiveCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSectionsOfCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllSectionsOfCourseResponse")
    public JAXBElement<GetAllSectionsOfCourseResponse> createGetAllSectionsOfCourseResponse(GetAllSectionsOfCourseResponse value) {
        return new JAXBElement<GetAllSectionsOfCourseResponse>(_GetAllSectionsOfCourseResponse_QNAME, GetAllSectionsOfCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrentSectionsOfCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllCurrentSectionsOfCourse")
    public JAXBElement<GetAllCurrentSectionsOfCourse> createGetAllCurrentSectionsOfCourse(GetAllCurrentSectionsOfCourse value) {
        return new JAXBElement<GetAllCurrentSectionsOfCourse>(_GetAllCurrentSectionsOfCourse_QNAME, GetAllCurrentSectionsOfCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentSectionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "NonexistentSectionException")
    public JAXBElement<NonexistentSectionException> createNonexistentSectionException(NonexistentSectionException value) {
        return new JAXBElement<NonexistentSectionException>(_NonexistentSectionException_QNAME, NonexistentSectionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSectionsOfCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllSectionsOfCourse")
    public JAXBElement<GetAllSectionsOfCourse> createGetAllSectionsOfCourse(GetAllSectionsOfCourse value) {
        return new JAXBElement<GetAllSectionsOfCourse>(_GetAllSectionsOfCourse_QNAME, GetAllSectionsOfCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseSkillCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getCourseSkillCodes")
    public JAXBElement<GetCourseSkillCodes> createGetCourseSkillCodes(GetCourseSkillCodes value) {
        return new JAXBElement<GetCourseSkillCodes>(_GetCourseSkillCodes_QNAME, GetCourseSkillCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://courseservice.com/", name = "getAllCourses")
    public JAXBElement<GetAllCourses> createGetAllCourses(GetAllCourses value) {
        return new JAXBElement<GetAllCourses>(_GetAllCourses_QNAME, GetAllCourses.class, null, value);
    }

}
