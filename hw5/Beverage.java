package menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;

    public Beverage(String name, int price, int size) {
        this.name = name;
        this.basePrice = price;
        this.size = size;
    }

    public boolean setSize(int size) {
        this.size = size;
        return true;
    }

    public boolean setSize(String size) {
        if ("TALL".equals(size))
            return setSize(TALL);
        else if ("GRANDE".equals(size))
            return setSize(GRANDE);
        else if ("VENTI".equals(size))
            return setSize(VENTI);
        return false;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return basePrice;
    }
    public String getSize() {
        switch (size){
            case 0: return "TALL";
            case 1: return "GRANDE";
            case 2: return "VENTI";
            default:return "nosize";
        }
    }
}
