import java.util.TreeSet;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = {123, 120, 144};
        
        TreeSet<Integer> t = new TreeSet<>();
        for(int num :arr){
            t.add(num);
        }
        int largest= t.last();
        int secondLargest= t.lower(largest);
        System.out.println("Second largest is "+ secondLargest);
    }
}
