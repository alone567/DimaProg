package Dima.Mirakin.Inb.ch.makery.adress.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class MPersonListWrapperD {

    private List<MPersonD> persons;

    @XmlElement(name = "person")
    public List<MPersonD> getPersons() {
        return persons;
    }

    public void setPersons(List<MPersonD> persons) {
        this.persons = persons;
    }
}