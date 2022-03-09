package abstractclass_interface.thuc_hanh.thuc_hanh.interface_comparator;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else return 0;
    }
}
