package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + String.format("%.1f", getArea()) + "sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }
}