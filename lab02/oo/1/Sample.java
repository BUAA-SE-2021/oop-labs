public class Sample {
    int x; // 1
    long y = x; // 2
    public void f(int n) {
        int m; // 3
        int t = n + m; // 4
    }
    public static void main(String[] args) {
        Sample t=new Sample();
        t.f(5);
        System.out.println(t.x);
    }
}