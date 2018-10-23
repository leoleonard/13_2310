package one;

import java.util.Comparator;

public class TimeComparator implements Comparator<Scores> {
    @Override
    public int compare(Scores o1, Scores o2) {
        if (o1.getTime() == o2.getTime()) {
            return 0;
        } else if (o1.getTime() > o2.getTime()) {
            return 1;
        } else {
            return -1;
        }
    }
}
