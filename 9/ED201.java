import java.util.Scanner;
class ED201{
    static Scanner in=new Scanner(System.in);
    static int max=0, dur=0;
    static int[] songs;
    public static int perm(int i, int cur){
        if(cur>dur){return 0;}
        if(i==songs.length){return cur;}
        int a=perm(i+1, cur+songs[i]);
        int b=perm(i+1, cur);
        return a>b ? a : b;
    }
    public static void main(String[] args) {
        dur=in.nextInt();
        int n=in.nextInt();
        in.nextLine();
        songs=new int[n];
        for(int i=0; i<n; i++){songs[i]=in.nextInt(); if(in.hasNextLine()){in.nextLine();}}
        System.out.println(perm(0, 0));
    }
}