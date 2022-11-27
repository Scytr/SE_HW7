package task1;

public interface Visitor {
    void visitElectronic(Electronic electronic);
    void visitFurniture(Furniture furniture);
    void visitGlass(Glass glass);
}
