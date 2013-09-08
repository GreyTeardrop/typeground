package domain;

import java.util.Set;

public class Protocol {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    private String id;
    private String text;
    private Set<Selection> selections;
    private MetaProtocolInfo metaProtocolInfo;

    ////////////////////////////////////////////////
    // GETTERS AND SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<Selection> getSelections() {
        return selections;
    }

    public void setSelections(Set<Selection> selections) {
        this.selections = selections;
    }

    public MetaProtocolInfo getMetaProtocolInfo() {
        return metaProtocolInfo;
    }

    public void setMetaProtocolInfo(MetaProtocolInfo metaProtocolInfo) {
        this.metaProtocolInfo = metaProtocolInfo;
    }
}
