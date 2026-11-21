import java.util.Scanner;
class ED222{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), k=in.nextInt(), t=in.nextInt();
        in.nextLine();//Skip eol
        int[] nums=new int[n];
        for(int i=0; i<n; i++){nums[i]=in.nextInt();}
        /*Base case for sliding windos - k */
        int res=0;
        int cur=0; /*Current n of acceptable sections*/
        boolean KEven=k%2==0 ? true : false;
        for(int i=0; i<k; i++){if(nums[i]>=t){cur++;}}
        if((cur>=k/2 && KEven)|| (cur>k/2 && !KEven)){res++;}
        for(int i=k; i<n; i++){
            /*3 cases:
                1. Add T and remove F -> cur++;
                2. Add F and remove T -> cur--;
                3. Add F and remove F or Add T and remove T is nothing*/
            if(nums[i]>=t && nums[i-k]<t){cur++;}
            else if(nums[i]<t && nums[i-k]>=t){cur--;}
            if((cur>=k/2 && KEven)|| (cur>k/2 && !KEven)){res++;}
        }
        System.out.println(res);
    }
}