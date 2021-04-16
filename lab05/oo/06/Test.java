interface I0 {
  void f(); // 默认是 abstract public 的
}

interface I1 {
  void f();
}

interface I2 {
  int a = 2; // 默认是 static public final 的

  int f();
}

interface I3 {
  int a = 3;

  int f(int i);
}

interface I4 {
  void f(int i);
}

class Test01 implements I0, I1 {
  @Override
  void f() {
  }
}

class Test02 implements I0, I2 {
  @Override
  void f() {
  }

  @Override
  int f() {
	return 0;
  }
}

class Test23 implements I2, I3 {
  @Override
  int f() {
	return a;
  }

  @Override
  int f(int i) {
	return i;
  }
}
