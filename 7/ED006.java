import java.util.Scanner;

class ED006{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n_cases=in.nextInt();
        for (int n=0; n<n_cases; n++){
            in.next(); //skip EOL
            int size_counter=in.nextLine().split(" ").length;
            int size_group=in.nextInt();
            CircularLinkedList<String> group=new CircularLinkedList<>();
            for(int i=0; i!=size_group; i++){group.addLast(in.next());}
            for(int i=0; i<size_group-1; i++){
                for(int j=0; j<size_counter-1; j++){
                    group.rotate();
                }
                group.removeFirst();
            }
            if(group.getFirst().equals("Carlos")){System.out.println("O Carlos nao se livrou");}
            else {System.out.println("O Carlos livrou-se (coitado do " + group.getFirst() + "!)");}
        }
        in.close();
    }
}