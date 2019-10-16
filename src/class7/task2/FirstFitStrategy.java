package class7.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstFitStrategy implements PackingStrategy {

    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        Set<Bin> bins = new HashSet<>();
        Bin bin = new Bin(capacity, new ArrayList<>());
        bins.add(bin);

        for (Integer value: values) {
            boolean isStored = false;
            for (Bin currentBin: bins) {
                try {
                    bin.store(value);
                    isStored = true;
                } catch (IllegalArgumentException ex) {

                }
            }

            if (!isStored) {
                bin = new Bin(capacity, new ArrayList<>());
                try {
                    bin.store(value);
                    bins.add(bin);
                } catch (IllegalArgumentException ex) {
                    return null;
                }
            }
        }
        return null;
    }
}
