package class7.task2;

import java.util.*;

public class BestFitStrategy implements PackingStrategy {

    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        List<Bin> bins = new ArrayList<>();
        Bin bin = new Bin(capacity, new ArrayList<>());
        bins.add(bin);

        for (int value: values) {
            int mostFitIdx = -1;
            int mostFitSize = Integer.MAX_VALUE;
            for (int i = 0; i < bins.size(); i++) {
                Bin currentBin = bins.get(i);
                int futureSpace = currentBin.getSpace() - value;
                if (futureSpace >= 0 && futureSpace < mostFitSize) {
                    mostFitIdx = i;
                    mostFitSize = futureSpace;
                }
            }

            if (mostFitIdx == -1) {
                try {
                    bin = new Bin(capacity, new ArrayList<>());
                    bin.store(value);
                    bins.add(bin);
                } catch (IllegalArgumentException ex) {
                    return null;
                }
            } else {
				try {
					Bin bin_ = bins.get(mostFitIdx);
					bin_.store(value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
        }
        return new HashSet<>(bins);
    }
}
