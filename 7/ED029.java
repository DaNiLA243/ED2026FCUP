import java.util.Scanner;
class ED029{
    static class Plane{
        private String name;
        private int time;
        Plane(String name, int time){
            this.name=name;
            this.time=time;
        }
        public String getName(){return this.name;}
        public int getTime(){return this.time;}
        public void setTime(int t){this.time=t;}
        public String toString(){return name.concat(" ").concat(String.valueOf(time));}
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int nTimes=in.nextInt(); if(in.hasNextLine()){in.nextLine();}//consume EOL if has one
        for(int n=0; n<nTimes; n++){
            //input part
            int nLanding=in.nextInt(), nTakingOff=in.nextInt(); if(in.hasNextLine()){in.nextLine();}//consume EOL if has one
            Plane[] planes=new Plane[nLanding+nTakingOff];
            for(int i=0; i<nLanding+nTakingOff; i++){
                planes[i] = new Plane(in.next(), in.nextInt());
                if(in.hasNextLine()){in.nextLine();}//consume EOL if has one
            }
            //merge part
            MyQueue<Plane> qPlanes = new LinkedListQueue<>();
            int i=0, j=nLanding;
            while(i<nLanding || j<nTakingOff+nLanding){
                if(j<nTakingOff+nLanding && (planes[j].getTime()<=planes[i].getTime() || i==nLanding)){
                    qPlanes.enqueue(planes[j]);
                    j++;
                }else if(i<nLanding || j==nTakingOff+nLanding){
                    qPlanes.enqueue(planes[i]);
                    i++;
                } 
            }
            //counting lateness
            int utc=0;
            System.out.println(String.valueOf(nLanding)+" "+ String.valueOf(nTakingOff));
            while(!qPlanes.isEmpty()){
                Plane currentPlane=qPlanes.dequeue();
                if(utc<currentPlane.getTime()){
                    utc=currentPlane.getTime()+1;
                    currentPlane.setTime(0);
                }else{
                    currentPlane.setTime(utc-currentPlane.getTime());
                    utc++;
                }
            }
            for(Plane p: planes){System.out.println(p.toString());}
        }
        in.close();
    }
}