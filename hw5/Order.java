package order;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem item) {
        items.add(item);
        //System.out.println(items);
    }
    public int cost(){
        DecimalFormat df = new DecimalFormat("###,###");
        int sum = 0;
        for(OrderItem item:items) {
            sum += item.beverage.getPrice()*item.quantity;
        }
        return sum;
    }
    public void print() {
        DecimalFormat df = new DecimalFormat("###,###");
        for(OrderItem item:items) {
            System.out.println(item.toString());
        }
        String total = df.format(cost());
        System.out.printf("Total: %s%n",total);
    }

    public boolean setSize(String name, String size) {
        for(OrderItem item:items) {
            if (name.equals(item.beverage.getName())){
                return item.beverage.setSize(size);
            }
        }
        return false;
    }
}
