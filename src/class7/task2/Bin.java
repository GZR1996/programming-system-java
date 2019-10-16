package class7.task2;

import java.util.ArrayList;

public class Bin {
    private int capacity;
    private ArrayList<Integer> weights;

    public Bin(int capacity, ArrayList<Integer> weights) {
        this.capacity = capacity;
        this.weights = weights;
    }

    public void store(int weight) throws IllegalArgumentException {
        if (weight > this.getSpace()) {
            throw new IllegalArgumentException();
        } else {
            weights.add(weight);
        }
    }

    public int getSpace() {
        int totalWeight = 0;
        for (Integer weight: weights) {
            totalWeight += weight;
        }
        return capacity - totalWeight;
    }
}
