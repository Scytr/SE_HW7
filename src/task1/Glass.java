package task1;

public class Glass implements HouseholdItem {
    @SuppressWarnings("all")
    private String name;
    @SuppressWarnings("all")
    private int length;
    @SuppressWarnings("all")
    private int width;
    @SuppressWarnings("all")
    private int height;
    @SuppressWarnings("all")
    private int thickness;

    public Glass(String name, int length, int width, int height, int thickness) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGlass(this);
    }

    // Getters
    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }

    public String getName() {
        return name;
    }
}
