public class BooleanArrayIntSet implements IntSet {
   private int size;   // Numero de elementos do conjunto
   private boolean elem[]; // Array que contem os elementos em si 
   private int maxElement;

   BooleanArrayIntSet(int maxElement) {
      elem = new boolean[maxElement+1];
      // this.maxElement=maxElement;
      size = 0;
   }

   public boolean add(int x) {
      if(x>=this.elem.length){
         return false;
      }
      if(this.contains(x)){return false;}
      this.elem[x]=true;
      size++;
      return true;
   }

   public boolean remove(int x) {
      if(x>=this.elem.length){
         return false;
      }
      if (!this.contains(x)){return false;}
      this.elem[x]=false;
      size--;
      return true;
   }
   
   
   public boolean contains(int x) {
      if(x>=this.elem.length){
         return false;
      }
      return (this.elem[x]);
   }
   
   public void clear() {
      if (this.size()==0){return;}
      for(int i=0; i<this.elem.length; i++){
         this.elem[i]=false;
      }
      size=0;
   }

   
   public int size() {
      return size;
   }

   public int maxElement(){
      return maxElement;
   }

   @Override 
   public String toString() {
      String res = "{";
      for (int i=0; i<this.elem.length; i++) {
         if(this.elem[i]){
            if (i>0) res += ",";
            res += elem[i];
         }
      }
      res += "}";
      return res;
   }
   public boolean equals(IntSet s){
      if(s.size()!=this.size()){return false;}
      int count=0;
      while(count<this.size() && count<s.size()){
         if(this.contains(count)!=s.contains(count)){return false;}
         count++;
      }
      return true;
   }
   public IntSet intersection(IntSet s){  
      IntSet res = new BooleanArrayIntSet(this.elem.length);
      for(int i=0; i<this.elem.length; i++){
         if(this.contains(i) && s.contains(i)){res.add(i);}
      }
      return res;
   }
}