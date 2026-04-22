// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {123, 120, 144};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>first){
                second = first;
                first= num;
            }
            else if(num>second && num!=first){
                second = num;
            }
        }
        System.out.println(second);
    }
}
