public class Recursion {

    public static void fn(int i){
        if (i <= 5){
            System.out.println(i);
            fn(i+1);
        }
    }
    
    public static void main(String[] arg){
        fn(1);
    }
    
}
