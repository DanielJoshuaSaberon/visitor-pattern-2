package VisitorPattern;

import VisitorPattern.Visitable.ConcreteClasses.*;
import VisitorPattern.Visitor.ShippingCalculator;
import VisitorPattern.Visitor.IShippingCostCalculator;

public class ECommerceApp {
    public static void main(String[] args) {
        Chair chair = new Chair(5.0);
        Table table = new Table(15.0, 15.0);
        Sofa sofa = new Sofa(10.0, 100.0);

        IShippingCostCalculator calculator = new ShippingCalculator();

        System.out.println("Chair Shipping Cost: $" + chair.accept(calculator));
        System.out.println("Table Shipping Cost: $" + table.accept(calculator));
        System.out.println("Sofa Shipping Cost: $" + sofa.accept(calculator));
    }
}
