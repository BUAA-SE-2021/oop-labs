interface Inter {
  void show();
}

class Outer {
  /* block */
}

public class Test8 {
  public static void main(String[] args) {
	Outer.method().show();
  }
}
