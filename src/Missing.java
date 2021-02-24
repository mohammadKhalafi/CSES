import java.util.*;
public class Missing {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        boolean[] used=new boolean[n];
        for(int i=0;i<n;i++){
            used[i]=false;
        }
        for(int i=0;i<n-1;i++){
            int x=scan.nextInt();
            used[x-1]=true;
        }
        for(int i=0;i<n;i++){
            if(!used[i]){
                System.out.println(i+1);
            }
        }
    }
}