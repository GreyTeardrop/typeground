package domain;

import java.util.Date;
import java.util.Set;

public class MetaProtocolInfo {

    private String name;
    private Person person; //типируемый
    private Set<Person> experts;
    private Date date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
