package class7.task2;

import java.util.*;

public class BestFitStrategy implements PackingStrategy {

    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        List<Bin> bins = new ArrayList<>();
        Bin bin = new Bin(capacity, new ArrayList<>());
        bins.add(bin);

        for (Integer value: values) {
            int mostFitIdx = -1;
            int mostFitSize = 0;
            for (int i = 0; i < bins.size(); i++) {
                Bin currentBin = bins.get(i);
                int currentSize = currentBin.getSpace() + value;
                if (currentSize < capacity && capacity - currentSize > mostFitSize) {
                    mostFitIdx = i;
                    mostFitSize = capacity - currentSize;
                }
            }

            if (mostFitIdx == -1) {
                try {
                    bin = new Bin(capacity, new ArrayList<>());
                    bins.add(bin);
                } catch (IllegalArgumentException ex) {
                    return null;
                }
            }
        }
        return new HashSet<>(bins);
    }
}
