import java.util.Arrays;
import java.util.Scanner;
class ED200{
    static Scanner in=new Scanner(System.in);
    static char[][] field;
    public static int wormSize(int y, int x){
        int res=1, rows=field.length, cols=field[0].length;
        if(y>=rows || y<0 || x>=cols || x<0){return 0;}
        if(field[y][x]=='.'){return 0;}
        field[y][x]='.';
        // System.out.printf("Iteration on %d %d\n", y, x);
        // for(int i=0; i<rows; i++){
        //     System.out.println(Arrays.toString(field[i]));
        // }
        for(int i=-1; i<2; i++){
            for(int j=-1; j<2; j++){
                if(i==0 && j==0){continue;}
                res+=wormSize(y+i, x+j);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nTimes=in.nextInt(); in.nextLine();
        for(int n=0; n<nTimes; n++){
            int rows=in.nextInt(), cols=in.nextInt(); in.nextLine();
            field=new char[rows][cols];
            //System.out.printf("%d %d\n", rows, cols);
            for(int i=0; i<rows; i++){field[i]=in.nextLine().toCharArray();} /*read field*/
            int max=0;
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    if(field[i][j]=='.'){continue;}
                    int cur=0;
                    cur=wormSize(i, j);
                    max=max<cur ? cur : max;
                }
            }
            System.out.println(max);
        }
        in.close();
    }
}