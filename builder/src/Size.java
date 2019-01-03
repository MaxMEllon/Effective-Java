public class Size {
    private final int diameter;

    public Size(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return this.diameter;
    }

    @Override
    public String toString() {
        return String.format("%d", this.diameter);
    }
}
