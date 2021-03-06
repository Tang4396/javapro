package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public abstract class  Teacher {
    /**
     * this 代表当前对象
     * super 代表调用父类
     *
     * super（） 代表调用父类的无参构造
     * super（） 无论你写不写super都在
     * 如果写 系统不会帮你生成  如果不写  系统会自动生成一个super
     * 如果写 要注意 super（）方法 必须在构造方法的第一句
     * */
    public Teacher(String name,int age){
        this.age=age;
        this.name=name;
    }
    private int age;
    private  String name;
    public abstract void  teach();

}
