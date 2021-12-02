package order;
import menu.Beverage;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[ " + "name=" + beverage.getName() +
                " ,Price=" + beverage.getPrice() +
                ", size=" + beverage.getSize() +
                ", quantity=" + quantity +
                " ]";
    }
}
