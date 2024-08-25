package Assignment;

import java.util.ArrayList;

public class IterateArrayList_P019 {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("test");
        list.add("assignment");

        for (String item : list) {
            System.out.println(item);
        }
    }


}
