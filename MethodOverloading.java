/*A Class have Multipule Methods Having Same 
name but differ in no.of arrguments & data types.*/


public class MethodOverloading
{
  void sum()
  {
    int x=9;
    int y=3;
    int z=x+y;
    System.out.println(z);
  }
  void sum(int x, int y)
  {
    System.out.println(x+y);
  }
  void sum(double x, int y)
  {
    System.out.println(x+y);
  }
  void sum(int x,int y,int z)
  {
    z +=x+y;
    System.out.println(z);
  }
  public static void main(String args[])
  {
    
    MethodOverloading mt = new MethodOverloading();
    mt.sum();
    mt.sum(2,4);
    mt.sum(3.4,9);
    mt.sum(9,7,3);
  }
}
    
