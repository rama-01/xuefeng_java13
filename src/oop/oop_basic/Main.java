package oop.oop_basic;

public class Main {
    public static void main(String[] args) {
        //基本类型参数传递
        Person person = new Person();
        //person.age;
        String bob = "Bob";
        person.setName(bob);
        System.out.println(person.getName());
        bob = "Alice";
        System.out.println(person.getName());
        //结论 基本类型参数的传递，是调用方值的复制，双方各自的后续修改，互不影响。
        //引用类型参数传递
        Person person2 = new Person();
        String[] groups = new String[]{"a1", "a2", "a3", "a4"};
        person2.setGroups(groups);
        System.out.println(person2.getGroups());
        groups[0] = "a100";
        System.out.println(person2.getGroups());
        //结论：引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）。
    }
}

class Person {
    private String name;
    private int age;
    private String scores;
    private String[] groups;

    public String getName() {
       /* this始终指向当前实例，如果没有命名冲突，可以省略this
        return this.name;*/
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

    //可变参数 或者String[] names
    public void setScores(String... names) {
        this.scores = scores;
    }

    public String getGroups() {
        return this.groups[0] + this.groups[1];
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }
}