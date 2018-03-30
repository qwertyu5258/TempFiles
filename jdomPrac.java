import java.net.URI;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class jdomPrac {

	 public static void main(String args[]) {

		 
		 try {
			 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			 DocumentBuilder builder = factory.newDocumentBuilder();
			 
			 URI uri = new URI("https://rss.blog.naver.com/knoc3.xml");
			 
			 Document doc = builder.parse(uri.toString());
			 
			 NodeList rss = doc.getElementsByTagName("rss");
			 
			 
			 NodeList rss2 = doc.getElementsByTagName("title");
			 System.out.println(rss2.item(2).getChildNodes().item(0));
			 rss2 = doc.getElementsByTagName("description");
			 System.out.println(rss2.item(1).getChildNodes().item(0));
			 
			 System.out.println(rss2.item(3).getChildNodes().item(0));
			 rss2 = doc.getElementsByTagName("description");
			 System.out.println(rss2.item(2).getChildNodes().item(0));
			 
			 System.out.println(rss2.item(4).getChildNodes().item(0));
			 rss2 = doc.getElementsByTagName("description");
			 System.out.println(rss2.item(3).getChildNodes().item(0));
			 
			 
			 NodeList channel = rss.item(0).getChildNodes();
			 NodeList _n = channel.item(0).getChildNodes();
			 int countList = (int)_n.getLength();
			 String list[] = new String[countList];
			 
			 for(int i=0;i<countList;i++) {
				 
				 if(_n.item(i).getChildNodes().item(0).getFirstChild()!=null) {
					 
					 break;
				 }
				 list[i] = _n.item(i).getTextContent();
				 System.out.println("item["+i+"]:"+list[i]);
				 
			 }
			 System.out.println("³¡´Ü");
		 
		 }

		 catch(Exception e){
			 System.out.println(e.toString());
		 }
		 
		 
		 
	 }
		 

}
