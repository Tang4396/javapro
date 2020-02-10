package com.test;

public class Person {
    public int age;
    public int no;
    public char sex;


    public int getAge() {
        return age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public char getSex() {
        return sex;
    }

    public static int add(int a,int b){
        int c = a+b;
        return c;
    }
}
