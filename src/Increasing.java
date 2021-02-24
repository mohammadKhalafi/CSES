import java.util.*;
public class Increasing {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(scan.nextInt());
        }
        int mx=0;
        long ans=0L;
        for(int i=0;i<n;i++){
            if(a.get(i)<mx){
                ans+=mx-a.get(i);
            }
            else{
                mx=a.get(i);
            }
        }
        System.out.println(ans);
    }
}
