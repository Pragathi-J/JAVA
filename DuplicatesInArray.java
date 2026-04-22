import java.util.HashSet;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5,9,8,9};
        HashSet<Integer> s = new HashSet<>();
        for(int num :arr){
            if(!s.add(num)){
                System.out.println("Duplicate is " +num);
            }
        }
        System.out.println("After removing Duplicates " + s);
    }
}
