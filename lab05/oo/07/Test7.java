class Outer {
  public int num = 10;

  class Inner {
	public int num = 20;

	public void show() {
	  int num = 30;
	  System.out.println(/* block1 */);
	  System.out.println(/* block2 */);
	  System.out.println(/* block3 */);
	}
  }
}

public class Test7 {
  public static void main(String[] args) {
	Outer.Inner oi = /* block4 */;
	oi.show();
  }
}
