public class Main {
    public static void main(String[] args) {
        Triangle tA=new Triangle(5,4,1,2,3);
        Triangle tB=new Triangle(7,8,9.2,4,5);
        double tAArea= tA.findArea();
        System.out.println(tAArea);
        double tBArea=tB.findArea();
        System.out.println(tBArea);
        /* l1 and base are non-static instance variables.their values are not the same for every triangle,their values change depending on the triangle instance*/
        System.out.println(tA.l1);
        System.out.println(tB.base);
        /*Note: Static values do not change per instance: they hold a value for the whole class to use
         */
        System.out.println(Triangle.numOfSides);//we can access static variable using the class name
    }
}

