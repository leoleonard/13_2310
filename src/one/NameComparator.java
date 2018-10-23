package one;

import java.util.Comparator;

public class NameComparator implements Comparator<Scores> {
    @Override
    public int compare(Scores o1, Scores o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
