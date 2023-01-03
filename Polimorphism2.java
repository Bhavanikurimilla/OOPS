class Polimorph{
    public void area(double r){
        System.out.println("Area of circle "+3.14*r*r);
    }
    public void area(double le,double br){
        System.out.println("Area of Rectangle "+le*br);
    }
    public void area(double a,double b,double h){
        System.out.println("Area of trapezium "+((a+b)*h)/2);
    }
    public void area(int L,int rad){
        System.out.println("Area of cone "+3.14*rad*(L+rad));
    }
}
class Polimorphism {
    public static void main(String[] args){
        Polimorph p=new Polimorph();
        p.area(4);
        p.area(12.4,3.6);
        p.area(45,3,6);
        p.area(12,3);
    }
}
