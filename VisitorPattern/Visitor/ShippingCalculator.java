package VisitorPattern.Visitor;

import VisitorPattern.Visitable.ConcreteClasses.*;

public class ShippingCalculator implements IShippingCostCalculator {

    @Override
    public double calculateShipping(Chair chair) {
        return 10.0;
    }

    @Override
    public double calculateShipping(Table table) {
        return (table.getWidth() * table.getLength()) * 0.3;
    }

    @Override
    public double calculateShipping(Sofa sofa) {
        return (sofa.getVolume() * 1.2) + (sofa.getDistance() * 0.3);
    }
}
