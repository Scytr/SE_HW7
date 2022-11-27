package task1;

public class PackingInstructor implements Visitor {
    private String instructions;

    @SuppressWarnings("all")
    public String getInstructions(HouseholdItem item) {
        instructions = "";
        item.accept(this);
        System.out.printf(instructions);
        return instructions;
    }

    @Override
    public void visitElectronic(Electronic electronic) {
        // Glassy Items should be packed in a box with a dimension of 1 cm larger
        // dimensions of the item and filled with Bubble wraps
        instructions = String.format("%s:\n >should be wrapped with Bubble wraps and packed in a box with dimension: %dx%dx%d\n",
                electronic.getName(),
                electronic.getLength(),
                electronic.getWidth(),
                electronic.getHeight()
        );
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        // Furniture Items should be covered with waterproof covers with an area of the furniture
        instructions = String.format("%s:\n >should be covered with waterproof covers with an area of:%dx%d\n",
                furniture.getName(),
                furniture.getLength(),
                furniture.getWidth()
        );
    }

    @Override
    public void visitGlass(Glass glass) {
        // Electronic Items should be covered with Polyethylene foam film and packed in
        // a box with a dimension of 1 cm larger dimensions of the item.
        instructions = String.format("%s:\n >should be covered with Polyethylene foam film and packed in a box with a dimension: %dx%dx%d\n",
                glass.getName(),
                glass.getLength(),
                glass.getWidth(),
                glass.getHeight()
        );
    }
}
