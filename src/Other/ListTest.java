package Other;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ListTest {
    private final Map<String, Integer> listTest = new HashMap<>();

    public final void fillList() {
        String n = "str";
        Integer i = 1;
        while (i - 1 != 10) {
            listTest.put(n.concat(String.valueOf(i)), i);
            i++;
        }
    }

    public void addToList(String name, Integer value) {
        boolean flag = false;
        for (String names : listTest.keySet()) {
            if (name.equals(names) && listTest.get(names).intValue() == value) {
                throw new IllegalArgumentException("Такое значение уже имеется");
            }
            if (name.equals(names) && listTest.get(names).intValue() != value) {
                listTest.put(name, value);
                flag=true;
                break;
            }
        }
        if (!flag) {
            listTest.put(name, value);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTest listTest1 = (ListTest) o;
        return Objects.equals(listTest, listTest1.listTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listTest);
    }

    @Override
    public String toString() {
        return ""+listTest;
    }
}
