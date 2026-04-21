public class Point {
	
    private String name;
    private double x;
    private double y;

    public Point(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
		return x;
	}
    
    public double getY() {
		return y;
	}
    
    public void setX(double x) {
		this.x = x;
	}
    
    public void setY(double y) {
		this.y = y;
	}
    
    
    @Override
    public String toString() {
        
    	return String.format("%s(%f,%f)",name,x,y);
      
    }
}
