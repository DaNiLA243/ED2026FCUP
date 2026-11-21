import java.util.Scanner;

class Game{
    private int rows, cols, nWords;
    String[] search;
    char[][] field;
    private char[][] answer;

    Game(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
        char[][] field= new char[rows][cols];
        char[][] answer= new char[rows][cols];
    }

    public void readField(Scanner in){
        for(int i=0; i!=this.rows; i++){
            this.field[i]=in.next().toCharArray();
            for(int j=0; j!=this.cols; j++){this.answer[i][j]='.';}
        }
    }

    public void readWords(Scanner in){
        this.nWords=in.nextInt();
        this.search = new String[nWords];
        for(int i=0; i!=this.nWords; i++){
            this.search[i]=in.next();
        }
    }
    public void write(){
        for(int i=0; i!=this.rows; i++){
            for(int j=0; j!=this.cols; j++){
                System.out.print(this.field[i][j]);
            }
            System.out.print("\n");
        }
    }
    public void writeAns(){
        for(int i=0; i!=this.rows; i++){
            for(int j=0; j!=this.cols; j++){
                System.out.print(this.answer[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    private void verifyWord(String word){
        char[] wordArr= new char[word.length()];
        wordArr=word.toCharArray();
        for(int y=0; y<this.rows; y++){
            for(int x=0; x<this.cols; x++){
                if(x<=this.cols-word.length()){ //left
                    
                }
                if(x>=word.length()-1){ //right

                }
                if(y<=this.rows-word.length()){ //down

                }
                if(y>=word.length()-1){ //up

                }
            }
        }
    }
}

public class soup{
    public static void main(String[] args) {
        Game game=new Game(10, 10);

    }
}