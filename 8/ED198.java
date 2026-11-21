import java.util.Scanner;
class ED198{
    /*The biggest sum of a subsequence*/
    /*So bc the max on the next iteration is either a new elem or past max plus new elem
    it is entierly possible to make this in linear time, without arrays
    Got it, the max sum on the next iteration is just the sum of new elem and the max on 
    prev iteration, therefore I just need to make an array with sums and track the max, lol*/
    
    public static int max(int a, int b){return a>b ? a : b;}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); in.nextLine();
        int max=in.nextInt();
        int prevmax=max;
        for(int i=1; i<n; i++){
            int cur=in.nextInt();
            if(max<max(cur, prevmax+cur)){max=max(cur, prevmax+cur);}
            prevmax=max(cur, prevmax+cur);
        }
        System.out.println(max);
        in.close();
    }
        /*Naive approach now for a baseline */
    /*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); in.nextLine();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){nums[i]=in.nextInt();}
        int max=nums[0];
        for(int i=0; i<n; i++){
            int tempsum=0;
            for(int j=i; j<n; j++){
                tempsum+=nums[j];
                if(tempsum>max){max=tempsum;}
            }
        }
        System.out.println(max);
    }*/
}