public class Overload2 {
    int a,b;
    int c=-1;
    public Overload2(){a=-2;}
    public Overload2(int p1,int p2){a=p1;  b=p2;}
    public Overload2(int p1,int p2,int p3){
      this(p1,p2);
      c=p3;
    }
  
    @Override
    public String toString(){
      return String.format("(a,b,c)=(%d,%d,%d)",a,b,c);
    }
    public static void main(String args[]){
      Overload2 s = new Overload2();
      System.out.println(s);
      System.out.println(new Overload2(5,6));
      System.out.println((new Overload2(2,3,4)).toString());
    }
}
  