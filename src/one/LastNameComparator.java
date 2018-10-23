package one;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Scores> {
    @Override
    public int compare(Scores o1, Scores o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
