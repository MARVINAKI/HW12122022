import Other.ListTest;
import Other.ListTest1;
import Other.ListTest2;
import Products.ListOfProduct;
import Products.Product;
import Products.Recipe;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        //Ex.1

        HashMap<String, Long> phonebook = new HashMap<>();
        String[] names = new String[20];
        long[] telNumbers = new long[20];
        for (int i = 0; i < names.length; i++) {
            names[i] = "name".concat(String.valueOf(i+1));
        }
        for (int i = 0; i < telNumbers.length; i++) {
            long n = (long) ((Math.random() * 1_000_000_000) + 9_000_000_000L);
            telNumbers[i] = n;
        }
        for (int i = 0; phonebook.size() != 20; i++) {
            int r = (int) (Math.random() * 20);
            phonebook.put(names[r], telNumbers[r]);
        }
        System.out.println(phonebook.keySet());
        System.out.println(phonebook.values());


        //Ex.2

        Product banana, apple, egg, butter;
        ListOfProduct listOfProduct = new ListOfProduct();
        listOfProduct.addToList(banana = new Product("Банан", 90, 1));
        listOfProduct.addToList(apple = new Product("Яблоко", 70, 1));
        listOfProduct.addToList(egg = new Product("Яйцо", 7, 1));
        listOfProduct.addToList(butter = new Product("Масло сливочное", 120, 1));

        Recipe fruitSalad = new Recipe();
        fruitSalad.addToRec(banana, 2);
        fruitSalad.addToRec(apple, 3);
        Recipe omelet = new Recipe();
        omelet.addToRec(egg, 3);
        omelet.addToRec(butter, 1);
        System.out.println(fruitSalad);


        //Ex.3

        ListTest listTest = new ListTest();
        listTest.fillList();
        System.out.println(listTest);
        listTest.addToList("str2", 22);
        System.out.println(listTest);


        //Ex.4

        ListTest1 listTest1 = new ListTest1();
        listTest1.fillList();
        System.out.println(listTest1);
        listTest1.convertList();


        //Ex.5
        ListTest2 listTest2 = new ListTest2();
        listTest2.fillList();
        System.out.println(listTest2);
    }
}