class A {
  void draw() {
	System.out.println("A.draw()");
  }

  A() {
	System.out.println("A() before draw()");
	draw();
	System.out.println("A() after draw()");
  }
}

class B extends A {
  private int b = 1;

  B(int b) {
	this.b = b;
	System.out.println("B(), b = " + this.b);
  }

  void draw() {
	System.out.println("B.draw(), b = " + this.b);
  }
}

public class Test4 {
  public static void main(String[] args) {
	new B(5);
  }
}
