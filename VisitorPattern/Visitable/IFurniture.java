package VisitorPattern.Visitable;

import VisitorPattern.Visitor.IShippingCostCalculator;

public interface IFurniture {
    double accept(IShippingCostCalculator calculator);
}