package coreJava;
import java.util.*;

public class PrintallElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(i,sc.nextInt());
        }
        System.out.println(list);
    }
}
