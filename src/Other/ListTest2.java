package Other;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ListTest2 {
    private Map<Integer, String> listTest2 = new LinkedHashMap<>();

    public void fillList() {
        for (int i = 0; listTest2.size() != 10; i++) {
            int r = (int) (Math.random() * 1000);
            listTest2.put(r, "text".concat(String.valueOf(i)));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTest2 listTest21 = (ListTest2) o;
        return Objects.equals(listTest2, listTest21.listTest2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listTest2);
    }

    @Override
    public String toString() {
        return "" + listTest2;
    }
}
