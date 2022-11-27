package task1;

public class MovingCostCalculator implements Visitor {
    private double cost;
    private String name;

    @SuppressWarnings("all")
    public double getCost(HouseholdItem item) {
        cost = 0;
        item.accept(this);
        System.out.printf("Total Cost for %s is %f Euros\n",
                name,
                cost);
        return cost;
    }

    @Override
    public void visitElectronic(Electronic electronic) {
        cost = electronic.getWeight() * (electronic.isFragile() ? 5./10 : 5./15);
        name = electronic.getName();
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        cost = furniture.getWeight() * 5 / 20.;
        // Alternatively assuming rounded up to nearest x20kg
        // cost = (furniture.getWeight() + 19) / 20 * 5;
        name = furniture.getName();
    }

    @Override
    public void visitGlass(Glass glass) {
        double pricePerMeter;
        switch (glass.getThickness()) {
            case 1:
                pricePerMeter = 2;
                break;
            case 2:
                pricePerMeter = 1.2;
                break;
            case 3:
                pricePerMeter = 0.7;
                break;
            default:
                throw new IllegalArgumentException("Thickness needs to be 1, 2 or 3");
        }
        cost = pricePerMeter * glass.getLength() / 100;
        name = glass.getName();
    }
}
