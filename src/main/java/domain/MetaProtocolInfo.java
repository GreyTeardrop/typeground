package domain;

import org.joda.time.DateTime;

import java.util.Set;

public class MetaProtocolInfo {

    private String name;
    private Person person; //типируемый
    private Set<Person> experts;
    private DateTime dateCreated;
    private DateTime dateModified;
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Person> getExperts() {
        return experts;
    }

    public void setExperts(Set<Person> experts) {
        this.experts = experts;
    }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public DateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(DateTime dateModified) {
        this.dateModified = dateModified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
