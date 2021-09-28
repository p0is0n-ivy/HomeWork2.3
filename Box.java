package project3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> list;

    public Box(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> getList() {
        return this.list;
    }

    public float getWeightBox() {
        float weightBox1;
        if (this.list.size() > 0) {
            weightBox1 = this.list.get(0).getWeight() * this.list.size();
            return weightBox1;
        } else {
            return 0;
        }
    }

    public boolean compare(Box<?> o) {
        return this.getWeightBox() - o.getWeightBox() == 0;
    }

    public void pourItIntoAnotherBox(Box<?> o) {
        ArrayList<?> inlist;
        inlist = o.getList();
        for (int i = 0; i < inlist.size(); i++) {
            this.list.add((T) inlist.get(i));
        }
    }
}
