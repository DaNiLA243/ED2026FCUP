import java.util.Scanner;

public class ED120{
    private static void print_times(char a, int times){
        for(int i=0; i<times; i++){System.out.print(a);}
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n=stdin.nextInt();
        for(int i=1; i<n; i+=2){
            print_times('.', (n-i)/2);
            print_times('#', i);
            print_times('.', (n-i)/2);
            System.out.print('\n');
        }
        for(int i=n; i>0; i-=2){
            print_times('.', (n-i)/2);
            print_times('#', i);
            print_times('.', (n-i)/2);
            System.out.print('\n');
        }
        stdin.close();
    }
}
