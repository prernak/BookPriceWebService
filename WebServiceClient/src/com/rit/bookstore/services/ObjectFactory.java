
package com.rit.bookstore.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rit.bookstore.services package. 
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

    private final static QName _BookDetailsByAuthorResponse_QNAME = new QName("http://services.bookstore.rit.com/", "BookDetailsByAuthorResponse");
    private final static QName _GetBookByTitleResponse_QNAME = new QName("http://services.bookstore.rit.com/", "getBookByTitleResponse");
    private final static QName _BookDetailsByAuthor_QNAME = new QName("http://services.bookstore.rit.com/", "BookDetailsByAuthor");
    private final static QName _GetBookByTitle_QNAME = new QName("http://services.bookstore.rit.com/", "getBookByTitle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rit.bookstore.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookDetailsByAuthorResponse }
     * 
     */
    public BookDetailsByAuthorResponse createBookDetailsByAuthorResponse() {
        return new BookDetailsByAuthorResponse();
    }

    /**
     * Create an instance of {@link GetBookByTitleResponse }
     * 
     */
    public GetBookByTitleResponse createGetBookByTitleResponse() {
        return new GetBookByTitleResponse();
    }

    /**
     * Create an instance of {@link BookDetailsByAuthor }
     * 
     */
    public BookDetailsByAuthor createBookDetailsByAuthor() {
        return new BookDetailsByAuthor();
    }

    /**
     * Create an instance of {@link GetBookByTitle }
     * 
     */
    public GetBookByTitle createGetBookByTitle() {
        return new GetBookByTitle();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailsByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookstore.rit.com/", name = "BookDetailsByAuthorResponse")
    public JAXBElement<BookDetailsByAuthorResponse> createBookDetailsByAuthorResponse(BookDetailsByAuthorResponse value) {
        return new JAXBElement<BookDetailsByAuthorResponse>(_BookDetailsByAuthorResponse_QNAME, BookDetailsByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookstore.rit.com/", name = "getBookByTitleResponse")
    public JAXBElement<GetBookByTitleResponse> createGetBookByTitleResponse(GetBookByTitleResponse value) {
        return new JAXBElement<GetBookByTitleResponse>(_GetBookByTitleResponse_QNAME, GetBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailsByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookstore.rit.com/", name = "BookDetailsByAuthor")
    public JAXBElement<BookDetailsByAuthor> createBookDetailsByAuthor(BookDetailsByAuthor value) {
        return new JAXBElement<BookDetailsByAuthor>(_BookDetailsByAuthor_QNAME, BookDetailsByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookstore.rit.com/", name = "getBookByTitle")
    public JAXBElement<GetBookByTitle> createGetBookByTitle(GetBookByTitle value) {
        return new JAXBElement<GetBookByTitle>(_GetBookByTitle_QNAME, GetBookByTitle.class, null, value);
    }

}
