class ED196{
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
        int len=q.size()/2;
        for(int i=0; i<len; i++){
            String name=q.dequeue();
            String queue=q.dequeue();
            if(queue.equals("A")){a.enqueue(name);}
            if(queue.equals("B")){b.enqueue(name);}
            if(queue.equals("X") && a.size()!=b.size()){
                if(a.size()<b.size()){a.enqueue(name);}
                else{b.enqueue(name);}
            }
        }
    }
}