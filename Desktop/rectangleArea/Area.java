public class Area{
    public static void main(String [] args){
        System.out.println("the area will be shown here");
       Rectangle m1 = new Rectangle();
        System.out.println(m1.length);
         System.out.println(m1.bredith);
        System.out.println("the area is" + m1.getArea());
        

    }
}
class Rectangle{
    public double length;
    public double bredith ;
     Rectangle(){
    length =6.6;
    bredith=5.7;

     }
    public double getLength(){
        return length;
    }
    public void setLength(double newLength){
        length = newLength;
    }
    public double getBreadith(){
        return bredith;
    }
    public void setBredith(double newBredith){
        bredith = newBredith;
    }
    public double getArea(){
       double area = length * bredith;
       return area;

    }
}