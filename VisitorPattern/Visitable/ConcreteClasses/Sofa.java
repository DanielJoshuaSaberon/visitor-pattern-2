package VisitorPattern.Visitable.ConcreteClasses;

import VisitorPattern.Visitable.IFurniture;
import VisitorPattern.Visitor.IShippingCostCalculator;

public class Sofa implements IFurniture {
    private double volume;
    private double distance;

    public Sofa(double volume, double distance) {
        this.volume = volume;
        this.distance = distance;
    }

    public double getVolume() {
        return volume;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(IShippingCostCalculator calculator) {
        return calculator.calculateShipping(this);
    }
}