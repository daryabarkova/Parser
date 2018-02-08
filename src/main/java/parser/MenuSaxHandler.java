package parser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import bean.Mother;

public class MenuSaxHandler extends DefaultHandler {
	
	private List<Mother> motherList = new ArrayList<Mother>();
	private Mother mother;
	private StringBuilder text;// = new StringBuilder();
	
	public List<Mother> getMotherList(){
		return motherList;
	}
	
	public void startDocument() throws SAXException{
		System.out.println("Parsing started.");
	}

	public void endDocument() throws SAXException{
		System.out.println("Parsing ended.");
		
	}
	
	public void characters(char[] buffer, int start, int length){
		text = new StringBuilder();
		text.append(buffer, start, length);
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		if(qName.equals("mother")){
			mother = new Mother();
			
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		
		MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase().replace("-", "_"));
		
		switch(tagName){
		case NAME: mother.setName(text.toString()); break;
		case SURNAME: mother.setSurname(text.toString()); break;
		case AGE: mother.setAge(Integer.parseInt(text.toString())); break;
		case MAIDEN_NAME: mother.setMaiden_name(text.toString()); mother = null; break;
		}
	}
}
