package Other;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest1 {
    private Map<String, List<Integer>> listTest1 = new HashMap<>(5);
    private Map<String, Integer> convertedList = new HashMap<>();
    private ArrayList<Integer> mas = new ArrayList<>();


    public final void fillList() {
        while (listTest1.size() != 5) {
            List<Integer> numbers = new ArrayList<>(3);
            while (numbers.size() != 3) {
                numbers.add((int) (Math.random() * 1000));
            }
            listTest1.put("rnd".concat(String.valueOf((int) (Math.random() * 10))), numbers);

        }
    }

    public final void convertList() {
        for (String s : listTest1.keySet()) {
            convertedList.put(s, listTest1.get(s).get(0) + listTest1.get(s).get(1) + listTest1.get(s).get(2));
        }
        System.out.println(convertedList.keySet());
        System.out.println(convertedList.values());

    }

    @Override
    public String toString() {
        return "" + listTest1;
    }
}
