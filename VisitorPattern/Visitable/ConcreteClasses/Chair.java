package VisitorPattern.Visitable.ConcreteClasses;

import VisitorPattern.Visitable.IFurniture;
import VisitorPattern.Visitor.IShippingCostCalculator;

public class Chair implements IFurniture {
    private double weight;

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(IShippingCostCalculator calculator) {
        return calculator.calculateShipping(this);
    }
}