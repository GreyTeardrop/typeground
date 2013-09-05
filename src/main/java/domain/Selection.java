package domain;

public class Selection {

    private int startPoint;
    private int endPoint;
    private SelectionMarks selectionMarks;

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public SelectionMarks getSelectionMarks() {
        return selectionMarks;
    }

    public void setSelectionMarks(SelectionMarks selectionMarks) {
        this.selectionMarks = selectionMarks;
    }
}
