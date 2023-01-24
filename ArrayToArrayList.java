package coreJava;

import java.util.*;

public class ArrayToArrayList {
    public static List<Integer> convertArrayToList(int[] array, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(array[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>(convertArrayToList(arr,n));
        System.out.println(ls);

    }
}
