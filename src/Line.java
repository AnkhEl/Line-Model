public class Line {
    private String name;
    private Point a;
    private Point b;

  public Line(String name, Point a, Point b){
    this.name = name;
    this.a = a;
    this.b = b;
  }

  public String getName(){

    return name;
  }

   public void setName(String name){

    this.name = name;
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

  public double getLength(){
     
    double dx = a.getX() - b.getY();
    double dy = b.getY() - a.getX();

    return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
  }

  @Override
  public String toString(){
   //return String.format("%s(%f,%f)",name,a,b);
  return String.format("The line %s is made up of point %s and point %s ", name,this.a.getName(),this.b.getName());
  }

}
