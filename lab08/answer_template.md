# Java程序设计 LAB08

```java
/**
 * 学号: 
 * 姓名:
 * JDK版本:
 * 代码文件编码方式:
 * IDE:
 */
```

## 1. Java中的检查型异常 `(checked exception)` 和非检查型异常 `(unchecked exception)` 有什么区别？ `简答`

> 写出答案



### 2. 简述Java异常处理中 `throws` 和 `throw` 关键字的作用。 `简答`

> 写出答案



### 3. 请列出2个常见的运行时异常和2个非运行时异常。 `简答`

> 写出答案



### 4. 指出下列程序的错误并改正。 `改错`

```java
import java.io.IOException;

public class p04 {
    public static void start() throws IOException,RuntimeException{
        throw new RuntimeException("Unable to Start");
    }

    public static void main(String[] args){
        try{
            start();
        }catch (Exception ex){
            ex.printStackTrace();
        }catch (RuntimeException re){
            re.printStackTrace();
        }
    }
}
```

>写出以上代码中需要修改的地方、怎样修改以及修改后运行成功的截图



### 5. 指出下列程序的错误并改正。 `改错`

```java
//SuperClass.java
import java.io.IOException;

public class SuperClass {
    public void start() throws IOException{
        throw new IOException("Unable to start");
    }
}

//SubClass.java
import java.io.FileInputStream;

public class SubClass extends SuperClass {
    public void start() throws Exception{
        throw new Exception("Unable to open file");
    }
    public void open(String fileName){
        FileInputStream fis=new FileInputStream(fileName);
    }
}
```

> 写出以上代码中需要修改的地方、怎样修改以及修改后运行成功的截图



### 6. 写出以下程序的输出。 `程序输出`

```java
public class p06 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            methodB();
        }
    }
    private static void methodA() {
        try {
            System.out.println("methodA抛出一个异常！");
            throw new RuntimeException();
        } finally {
            System.out.println("执行methodA的finally!");
        }
    }
    private static void methodB() {
        try {
            System.out.println("methodB执行！");
        } finally {
            System.out.println("执行methodB的finally!");
        }
    }
}
```

> 截图输出结果或者直接复制输出结果



### 7. 写出以下程序的输出，试着解释三个函数不同输出的原因。 `程序输出`


```java
public class p07 {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println(get0());
        System.out.println("-----------------------");
        System.out.println(get1());
        System.out.println("-----------------------");
        System.out.println(get2());
        System.out.println("-----------------------");
    }
    public static int get0(){
        int i=1;
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("error");
            return i;
        }finally {
            i++;
            System.out.println("i in finally block:"+i);
        }
    }
    public static String get1(){
        String i="ok";
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("error");
            return i;
        }finally {
            i+="finally";
            System.out.println("i in finally:"+i);
        }
    }
    public static StringBuilder get2(){
        StringBuilder i=new StringBuilder("ok");
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("error");
            return i;
        }finally {
            i.append("finally");
            System.out.println("i in finally:"+i);
        }
    }
}
```

> 截图输出结果或者直接复制输出结果，并解释 `get0(), get1(), get2()` 三个函数不同输出的原因





### 8. Calculate `编程题`

> 注意写在oo文件夹中



### 9. Triangle `编程题`

> 注意写在oo文件夹中

