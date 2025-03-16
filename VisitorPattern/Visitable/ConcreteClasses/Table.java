package VisitorPattern.Visitable.ConcreteClasses;

import VisitorPattern.Visitable.IFurniture;
import VisitorPattern.Visitor.IShippingCostCalculator;

public class Table implements IFurniture {
    private double width;
    private double length;

    public Table(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double accept(IShippingCostCalculator calculator) {
        return calculator.calculateShipping(this);
    }
}