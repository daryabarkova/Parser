package console;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import bean.Mother;
import parser.MenuSaxHandler;

public class MainApp {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		
		MenuSaxHandler handler = new MenuSaxHandler();
		
		reader.setContentHandler(handler);
		
		reader.parse(new InputSource("D:\\students\\dbarkova\\htp-parcer\\src\\main\\resources\\family.xml"));
		
		List<Mother> menu = handler.getMotherList();

	}

}
