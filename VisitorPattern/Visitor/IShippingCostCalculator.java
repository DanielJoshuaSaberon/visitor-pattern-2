package VisitorPattern.Visitor;

import VisitorPattern.Visitable.ConcreteClasses.*;

public interface IShippingCostCalculator {
    double calculateShipping(Chair chair);
    double calculateShipping(Table table);
    double calculateShipping(Sofa sofa);
}