package Assignment;

import java.util.ArrayList;

public class RemoveElementArrayList_P021 {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");

    if (list.size() >= 3) {
        list.remove(3); 
    }

    System.out.println("Updated list: " + list);
}


}
