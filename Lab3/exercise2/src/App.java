class Rectangle {

  private double width;
  private double length;

  public double getArea() {
    return width * length; 
  }

  public double getPerimeter() {
    return 2 * (width + length);
  }
  //constructor
  public Rectangle(double width, double length){
    this.length = length; 
    this.width = width;
  }

}
