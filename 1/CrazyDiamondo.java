public class CrazyDiamondo{
    public static void print_times(char x, int times){
        while(times>0){
            System.out.print(x);
            times--;
        }
    }
    public static void diamond(int size){
        int i=1;
        if(size%2==0){i++;}
        while(i<=size){
            print_times(' ', (size-i)/2);
            print_times('#', i);
            print_times(' ', (size-i)/2);
            System.out.print('\n');
            i+=2;
        }
        i-=2;
        while(i>0){
            print_times(' ', (size-i)/2);
            print_times('#', i);
            print_times(' ', (size-i)/2);
            System.out.print('\n');
            i-=2;
        }
    }
    public void main(String[] args){
        Integer.valueOf(args[0]);
        diamond(Integer.valueOf(args[0]));
    }
}