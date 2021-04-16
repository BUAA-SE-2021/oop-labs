class PrivateOverride {
  private void f() {
	System.out.println("private f()");
  }

  public static void main(String[] args) {
	PrivateOverride po = new Derived();
	po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() {
	System.out.println("public f()");
  }
}

public class Test1 {
  public static void main(String[] args) {
	PrivateOverride.main(args);
  }
}
    