package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayList_P020 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter new element: ");
        String element = sc.nextLine();
       

        if (index >= 0 && index < list.size()) {
            list.set(index, element);
            System.out.println("Updated list: " + list);
        } else {
            System.out.println("Invalid index.");
        }
    }


}
