class Main{
    public static void main(String[] args){
        String s = "praarp";
        String rev = "";
        for(int i =s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println("String is a pallindrome");
        }
        else{
            System.out.println("String is not a pallindrome");
        }
    }
}
