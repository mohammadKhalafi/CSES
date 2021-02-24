import java.util.*;
public class Weird {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        long n=scan.nextLong();
        while(n>1){
            System.out.print(n+" ");
            if(n%2==0){
                n/=2;
            }
            else{
                n*=3;
                n+=1;
            }
        }
        System.out.print(1);
    }
}