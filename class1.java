import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class class1 {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document doc = builder.parse("https://rss.blog.naver.com/knoc3.xml");
			NodeList rss = doc.getElementsByTagName("rss");
			NodeList channel = rss.item(0).getChildNodes();
			NodeList _n = channel.item(0).getChildNodes();
			int countList = (int) _n.getLength();
			String list[] = new String[countList];

			System.out.println("들어옴");
			System.out.print(countList);
			for (int i = 0; i < countList; i++) {

				System.out.println("브레이크전");
				if (_n.item(i).getChildNodes().item(0).getFirstChild() != null) {
					System.out.print("브레이크");
					break;
				}
				
				System.out.println("출력전");
				list[i] = _n.item(i).getTextContent();
				System.out.println("item[" + i + "]:" + list[i]);

			}

		}

		catch (Exception e) {
			System.out.println("에러");
			System.out.println(e.toString());
		}
	}

}
