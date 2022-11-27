package task1;

public class Electronic implements HouseholdItem {
    @SuppressWarnings("all")
    private String name;
    @SuppressWarnings("all")
    private int length;
    @SuppressWarnings("all")
    private int width;
    @SuppressWarnings("all")
    private int height;
    @SuppressWarnings("all")
    private int weight;
    @SuppressWarnings("all")
    private boolean fragile;

    public Electronic(String name, int length, int width, int height, int weight, boolean fragile) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.fragile = fragile;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElectronic(this);
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

    public int getWeight() {
        return weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String getName() {
        return name;
    }
}
