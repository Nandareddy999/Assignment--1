package coreJava;
import javax.swing.*;
import java.util.*;

public class ReverseArrayList {
    public static List<Integer> reverseArrayList(int n, ArrayList<Integer>List1){
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            ls.add(List1.get(i));
        }
        return ls;
    }
    //another function for sorting
    public static List<Integer> SortArrayList(ArrayList<Integer> list4){
        Collections.sort(list4);
        return list4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(i,sc.nextInt());
        }
        ArrayList<Integer> Reverse = new ArrayList<>(reverseArrayList(n,list));
        System.out.println(Reverse);
        System.out.println(" ------------- ---------------- --------------");
        System.out.println("After sorting the list : ");

        ArrayList<Integer> list2 = new ArrayList<>(SortArrayList(list));
        System.out.println(list2);
        System.out.println(" ============================= ");

        list.remove(2);
        System.out.println("After deleting the element the list is : ");
        System.out.println(list);
    }
}
