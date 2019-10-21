package class8.task2;

import java.util.*;

public class WishList {

    private List<BrickSet> sets;

    public WishList() {
        sets = new ArrayList<>();
    }

    public Collection<BrickSet> getSets() {
        return sets;
    }

    public boolean addSet(BrickSet set) {
        if (!sets.contains(set)) {
            sets.add(set);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeSet(BrickSet set) {
        if (sets.contains(set)) {
            sets.remove(set);
            return true;
        } else {
            return false;
        }
    }

    public List<BrickSet> sort() {
        Collections.sort(sets, new Comparator<BrickSet>() {
            @Override
            public int compare(BrickSet o1, BrickSet o2) {
                return 0;
            }
        });
        return sets;
    }
}
