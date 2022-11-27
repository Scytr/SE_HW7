package task1;

public class Furniture implements HouseholdItem {
    @SuppressWarnings("all")
    private String name;
    @SuppressWarnings("all")
    private String type;
    @SuppressWarnings("all")
    private int length;
    @SuppressWarnings("all")
    private int width;
    @SuppressWarnings("all")
    private int height;
    @SuppressWarnings("all")
    private int weight;

    public Furniture(String name, String type, int length, int width, int height, int weight) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFurniture(this);
    }

    // Getters
    @SuppressWarnings("unused")
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

    @SuppressWarnings("unused")
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
