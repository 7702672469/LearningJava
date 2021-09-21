public class Triangle {
    static int numOfSides=3;
    double  base;
    double height;
    double l1;
    double l2;
    double l3;
    public Triangle(double base,double height,double l1,double l2,double l3)
    {
        this.base=base;
        this.height=height;
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
    }
    public double findArea()
    {
        return (this.base*this.height)/2;
    }
}
