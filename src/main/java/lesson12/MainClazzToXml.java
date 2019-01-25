package lesson12;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainClazzToXml {
	public static void main(String[] args) {

		MateGroup mateGroup = MateGroup.mateGroupExampleCreator();

		try {
			File file = new File("src/resources/mateGroup.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(MateGroup.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(mateGroup, file);
			jaxbMarshaller.marshal(mateGroup, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}