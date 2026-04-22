import java.util.HashSet;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5};
        System.out.println("Before removing duplicates "+Arrays.toString(arr));
        HashSet<Integer> s = new HashSet<>();
        for(int num :arr){
            s.add(num);
        }
        System.out.println("After removing Duplicates " + s);
    }
}
