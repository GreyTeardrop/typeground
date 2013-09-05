package domain;

import java.util.Set;

public class Protocol {

    private String text;
    private Set<Selection> selections;
    private MetaProtocolInfo metaProtocolInfo;

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
