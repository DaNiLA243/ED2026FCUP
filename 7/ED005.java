import java.util.Scanner;
import java.lang.String;
class ED005{
    public static void main(String args[]){
        Scanner stdin=new Scanner(System.in);
        int nTimes=stdin.nextInt();
        stdin.nextLine();
        for(int i=0; i<nTimes; i++){
            MyStack<Integer> s=new LinkedListStack<>();
            String line=stdin.nextLine();
            Scanner local_in=new Scanner(line);
            boolean flag=true;
            while(local_in.hasNext()){
                if(local_in.hasNextInt()){
                    s.push(local_in.nextInt());
                }
                else{
                    String op=local_in.next();
                    if (s.size()<2){
                        flag=false;
                        break;
                    }
                    else{
                        int op1=s.pop();
                        int op2=s.pop();
                        if(op.equals("*")){s.push(op2 * op1);}
                        else if(op.equals("/")){s.push(op2 / op1);}
                        else if(op.equals("+")){s.push(op2 + op1);}
                        else {s.push(op2 - op1);}
                    }
                }
            }
            if(s.size()==1 && flag){System.out.println(s.pop());}
            else{System.out.println("Expressao Incorrecta");}
            local_in.close();
        }
        stdin.close();
    }
}