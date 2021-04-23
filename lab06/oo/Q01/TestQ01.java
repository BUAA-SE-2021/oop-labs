class Outer {
  public int num = 10;

  class Inner {
	public int num = 20;

	public void show() {
	  int num = 30;
	  System.out.println(/*???*/);
	  System.out.println(/*???*/);
	  System.out.println(/*???*/);
	}
  }
}

public class TestQ01 {
  public static void main(String[] args) {
	Outer.Inner oi = /*???*/;
	oi.show();
  }
}