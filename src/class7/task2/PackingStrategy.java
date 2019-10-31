package class7.task2;

import javax.swing.*;
import java.util.List;
import java.util.Set;

public interface PackingStrategy {

    Set<Bin> pack(int capacity, List<Integer> values);
}
