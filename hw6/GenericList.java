package ed.pnu.collection;

import ed.pnu.admin.Player;

import java.util.Arrays;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public GenericList(Object[] data) {
        this.data = data;
    }

    public int getSize() {
        return this.size;
    }

    public Object get(int i) {
        return data[i];
    }

    public void add(Object player) {
        data[size] = player;
        size += 1;

    }

    public void clear() {
        Arrays.fill(data,0);
        size = 0;
    }


}
