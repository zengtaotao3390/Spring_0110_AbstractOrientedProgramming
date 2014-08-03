/**
 * Created by y400 on 2014/8/3.
 */
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.List;

public class Simple {
    public static void main(String[] args) throws JDOMException, IOException {
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(Simple.class.getClassLoader().getResourceAsStream("test.xml"));
        Element root = doc.getRootElement();
        List list = root.getChildren("disk");
        for(int rootIndex = 0; rootIndex < list.size(); rootIndex++){
            Element  element = (Element)list.get(rootIndex);
            System.out.println(element.getAttributeValue("name"));
            System.out.println(element.getChildText("capacity"));
            System.out.println(element.getChildText("directorities"));
            System.out.println(element.getChildText("files"));
        }
    }
}
