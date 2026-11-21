import java.lang.*;
import java.util.Scanner;
public class ED121{
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        System.out.println(n);
        stdin.nextLine();
        for(int i=0; i<n; i++){
            String in=stdin.nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            int length=in.length();
            char[] inarr=in.toCharArray();
            int j=0;
            while(inarr[j]==inarr[length-1-j] && j!=length/2){j++;}
            if(j==length/2){
                System.out.println("sim");
            }else{
                System.out.println("nao");
            }
        }
    }
}
