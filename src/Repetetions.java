import java.util.*;
public class Repetetions {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        int n=s.length();
        char cur='Z';
        int ans=0;
        int now=0;
        for(int i=0;i<n;i++){
            if(cur==s.charAt(i)){
                now++;
            }
            else{
                ans=Math.max(now,ans);
                now=1;
                cur=s.charAt(i);
            }
        }
        ans=Math.max(ans,now);
        System.out.println(ans);
    }
}