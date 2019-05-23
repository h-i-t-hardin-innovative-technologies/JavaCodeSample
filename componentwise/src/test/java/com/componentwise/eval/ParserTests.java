package com.componentwise.eval;

import javax.xml.stream.XMLStreamException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParserTests {
	
	private XmlValidator parser = new XmlValidator();
	
	@Test
	public void testXmlParserPass() throws XMLStreamException {
	
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<BackgroundCheck>" + 
				"	<CriminalHistory>" + 
				"		<HistoryCode>x</HistoryCode>" + 
				"		<HistoryCode>y</HistoryCode>" + 
				"		<HistoryCode>z</HistoryCode>" + 
				"	</CriminalHistory>" + 
				"</BackgroundCheck>";
		parser.validate(xmlString);
	}
	
	@Test(expected=XMLStreamException.class)
	public void testXmlParserFail() throws XMLStreamException {
		
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<BackgroundCheck>" + 
				"        <CriminalHistory>" + 
				"                <HistoryCode>x</HistoryCode>" + 
				"                < HistoryCode>y</HistoryCode>" + 
				"                < HistoryCode>z</HistoryCode>" + 
				"        </CriminalHistory>\r\n" + 
				"</BackgroundCheck>\r\n";
		parser.validate(xmlString);
		
	}

}
