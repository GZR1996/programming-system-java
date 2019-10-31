package class7.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    	List<Integer> values = new ArrayList<Integer>();
    	values.add(75);
    	values.add(50);
    	values.add(20);
    	values.add(60);
    	values.add(40);
    	values.add(50);
    	NextFitStrategy strategy = new NextFitStrategy();
    	Set<Bin> bins = strategy.pack(100, values);
    	for (Bin bin: bins) {
    		System.out.println(bin);
    	}
    }
}
