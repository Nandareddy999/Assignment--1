package coreJava;
import java.util.*;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first List : ");
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0; i<n; i++){
            list1.add(i,sc.nextInt());
        }
        System.out.println("Enter the size of the second list : ");
        int m = sc.nextInt();
        ArrayList<Integer>list2 = new ArrayList<>();
        for(int i=0; i<m; i++){
            list2.add(i,sc.nextInt());
        }

        list1.addAll(list2);
        System.out.println(list1);
    }
}
