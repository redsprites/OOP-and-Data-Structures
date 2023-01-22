
public class Octagon extends GeometricObject implements Comparable <Octagon>, Cloneable{
     double area = 0;
     double side = 0;
     double perimeter = 0;
     boolean wasCloned = false;

     public Octagon(double side) {
         this.side = side;
     }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Octagon clonedOct =  (Octagon) super.clone();
        clonedOct.wasCloned = true;
        return clonedOct;

    }
    @Override
    public double getArea() {
        area = (2 + 4 / Math.sqrt(2)) * Math.pow(side, 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 8;
        return perimeter;
    }

    @Override
    public java.lang.String toString() {
        return "oct1: Octagon with side = " + this.side+  ", Perimeter = " + getPerimeter() +  ", Area = " + getArea() + ", Was Cloned = "+ this.wasCloned;

 }

    @Override
    public int compareTo(Octagon o) {
            if(this.area > o.getArea())
                return 1;
            else if (this.area == o.getArea())
                return 0;
            else return -1;
        }


}

