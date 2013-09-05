package domain;

import domain.type.*;

public class SelectionMarks {

    private String comment;
    private boolean isNeedClarification;
    private MarkMode markMode;
    private Mark mark; //аспект или блок или перевод
    private Sign sign; //знак
    private Dimension dimencion; //размерность
    private Tality tality; //тальность

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isNeedClarification() {
        return isNeedClarification;
    }

    public void setNeedClarification(boolean needClarification) {
        isNeedClarification = needClarification;
    }

    public MarkMode getMarkMode() {
        return markMode;
    }

    public void setMarkMode(MarkMode markMode) {
        this.markMode = markMode;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Dimension getDimencion() {
        return dimencion;
    }

    public void setDimencion(Dimension dimencion) {
        this.dimencion = dimencion;
    }

    public Tality getTality() {
        return tality;
    }

    public void setTality(Tality tality) {
        this.tality = tality;
    }
}
