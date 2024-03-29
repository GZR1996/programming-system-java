package class7.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NextFitStrategy implements PackingStrategy {

    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        List<Bin> bins = new ArrayList<>();
        Bin bin =  new Bin(capacity, new ArrayList<>());
        bins.add(bin);

        for (int value: values) {
        	try {
    			bin.store(value);
            } catch (IllegalArgumentException ex) {
                bin = new Bin(capacity, new ArrayList<>());
                try {
                    bin.store(value);
                    bins.add(bin);
                } catch (IllegalArgumentException ex_) {
                    return null;
                }
            }
        }
        return new HashSet<Bin>(bins);
    }
}
