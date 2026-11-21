import java.util.*;

public class ED183{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int max=in.nextInt();
        int min=max;
        int sum=max;
        for(int i=1; i<n; i++){
            int cur=in.nextInt();
            sum+=cur;
            if(min>cur){min=cur;}
            if(max<cur){max=cur;}
        }
        System.out.printf(Locale.US,"%.2f\n", (double)sum/n);
        System.out.println(max-min);  
        in.close();
    }
}