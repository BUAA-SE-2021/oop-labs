<div style="font-family:'Fira Code', 'PingFang SC'">

# Java 程序设计 LAB07

## 实验目的

- 理解集合框架的设计思路

- 了解 Java 常用的数据结构类及其使用，重点迭代器(Iterator) 、线性表（List、ArrayList、LinkedList）、HashMap 类、HashSet 类及枚举类在企业级软件编写中经常用到，要求在理解的基础上，熟练掌握

- 理解泛型的概念、必要性并能够灵活使用

## 实验题目

### 1. 简述`ArrayList`和`LinkedList`的区别 `简答`

>

### 2. 写出以下程序的输出 `简答`

```java
//Animal.java
public class Animal {
    public Animal(){
        System.out.println("I am an animal");
    }
}

//Dog.java
public class Dog extends Animal{
    public Dog(){
        System.out.println("I am a dog");
    }
}

//AnimalTest.java
public class AnimalTest {
    public <T,S extends T> T testDemo(T t,S s){
        System.out.println("I am type T and my type is "+t.getClass().getName());
        System.out.println("I am type S and my type is "+s.getClass().getName());
        return t;
    }
    public static void main(String[] args){
        AnimalTest test=new AnimalTest();
        Dog dog=new Dog();
        Animal animal=new Animal();
        Animal animal1=test.testDemo(animal,dog);
    }
}
```

### 3. 写出以下程序的输出(注意通配符的使用) `简答`

```java
//Animal.java
public class Animal {
    public Animal(){
        System.out.println("I am an animal");
    }
}

//Dog.java
public class Dog extends Animal{
    public Dog(){
        System.out.println("I am a dog");
    }
}

//AnimalTest1.java
import java.util.List;
import java.util.ArrayList;

public class AnimalTest1 {
    public void testDemo(List<?> s){
        for(Object obj:s){
            System.out.println("My type is "+obj.getClass().getName());
        }
    }
    public static void main(String[] args){
        AnimalTest1 test=new AnimalTest1();
        Dog dog=new Dog();
        Animal animal=new Animal();
        List<Animal> s=new ArrayList<Animal>();
        s.add(dog);
        s.add(animal);
        test.testDemo(s);
    }
}
```

### 4. 编写程序完成以下要求 `编程`

产生 10 个 1-100 的随机数，并放到一个数组中，把数组中大于等于 50 的数字放到一个 list 集合中，并打印到控制台。

### 5. 编写程序完成以下要求 `编程`

请用 LinkedList 实现一个支持泛型的栈 MyStack，并在 main 函数中测试

```java
//MyStack.java
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> values=new LinkedList<T>();
    public void push(T t){
        //Your code here
    }
    public T pull(){
        //Your code here
    }
    public T peek(){
        //Your code here
    }
    public static void main(String[] args){
        /* Your test code here */
    }
}
```

### 6. 编写程序完成以下要求 `编程`

假如有以下 email 数据 `aa@sohu.com, bb@163.com, cc@sina.com, ...` 现需要把 email 中的用户名和邮件地址部分分离(例如 `aa@sohu.com` 分离为 `aa` 和 `sohu.com` )，分离后以键值对应的方式放入 `HashMap` 。
给定 email 数据为：
`String str = "aa@sohu.com,bb@163.com,cc@sina.com";`

```java
import java.util.HashMap;
import java.util.Map;

public class EmailSplit {
    public static void main(String[] args)
    {
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        Map<String, String> emailMap = new HashMap<String, String>();
        /*
        Your code here
         */
        System.out.println(emailMap.toString());
    }
}
```

### 7. 编写程序完成以下要求 `编程`

双色球规则：双色球每注投注号码由 6 个红色球号码和 1 个蓝色球号码组成。红色球号码从 1—33 中选择；蓝色球号码从 1—16 中选择；请随机生成一注双色球号码，并输出到控制台。（要求同色号码不重复）
举例如下，双色球号码一注：

> 红球 8
> 红球 20
> 红球 17
> 红球 1
> 红球 28
> 蓝球 6
> 红球 32

```java
public class TwoColorBall {
    public static void main(String[] args) {
        /*
        Your code here
         */
    }
}
```
