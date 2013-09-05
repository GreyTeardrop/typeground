package domain.type;

public enum Sign {
    PLUS ("+"),
    MINUS ("-");

    private final String representation;

    private Sign(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}
