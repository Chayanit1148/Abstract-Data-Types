public class IntegerSetTeast {
     public static void main(String[] args) {

        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);
        String s ="{50,70}" ;
        System.out.println(a.toString());
        if(s.toString().replace(" ","").equals(s))
         System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}
