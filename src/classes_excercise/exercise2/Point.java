package classes_excercise.exercise2;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
        System.out.println("Default case");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }

    public double distance(int xa, int ya){
      return Math.sqrt((x-xa)*(x-xa)+(y-ya)*(y-ya));
    }

    public double distance(Point p){
        return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
    }

}
