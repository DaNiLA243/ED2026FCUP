class Rectangle{
   int x1, y1, x2, y2;

   Rectangle(int x1, int y1, int x2, int y2) {
      this.x1=x1;
      this.y1=y1;
      this.x2=x2;
      this.y2=y2;
   }
   Rectangle(Point p1, Point p2) {
      x1=p1.x;
      y1=p1.y;
      x2=p2.x;
      y2=p2.y;
   }
   int perimeter(){return (x2-x1)*2+(y2-y1)*2;}
   int area(){return (x2-x1)*(y2-y1);}
   boolean pointInside(Point p){return (p.x<=x2 && p.x>=x1 && p.y<=y2 && p.y>=y1);}
   boolean rectangleInside(Rectangle r){return (r.x1>=x1 && r.y1>=y1 && r.x2<=x2 && r.y2<=y2);}
}
