public class Line {
    private String name;
    private Point a;
    private Point b;

  public Line(String name, Point a, Point b){
    this.name = name;
    this.a = a;
    this.b = b;
  }

  public Point getA(){
    return a;
  }

  public void setA(Point a){
    this.a = a;
  }
  
  public Point getB(){
    return b;
  }

  public void setB(Point b){
    this.b = b;
  }

  


}
