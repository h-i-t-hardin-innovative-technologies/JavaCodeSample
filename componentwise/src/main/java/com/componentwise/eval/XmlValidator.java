package com.componentwise.eval;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * The XmlValidator validates an xml string by simply reading the 
 * xml string as an XMLStream reader. If any call to 'next' fails in
 * the reader, then we know the string is not valid XML
 * 
 * @author bhardin
 *
 */
public class XmlValidator {
	
	XMLInputFactory factory = XMLInputFactory.newInstance(); 
	
	public void validate(final String xmlString) throws XMLStreamException {
		
		Reader reader = new StringReader(xmlString);
		XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);
        while(xmlReader.hasNext()){
        	xmlReader.next();
        }
        
	}

}
