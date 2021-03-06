package com.test;

/**
 * Created by admin on 2020/2/7.
 */
public class String_1 {
    public static void main(String[] args) {
        //String 是Java中的字符串
        //什么是字符串  是由一个或者多个字符串组成 定义的时候 用 双引号包裹
        //String 是类   所以是引用类型 底层是char数组
        //final 最终 不能改变
        //如果一个变量加了final 那么该变量不可再改变
        //如果类加上了final 修饰 该类不可被继承
        //String 底层的char数组是final 修饰  所以String 是不可变的字符串
        //String 的存储比较特殊
        //String a=“abc”； 这种写法 代表 a指向字符串常量池 abc这个字符串中
        //String a = new String("abc")  这种写法代表 在堆内存中创建一个对象 将a指向到堆内存中
        //用双等号判断String并非判断里面的值是否一样 而是判断地址是否一样即使是两个值一样的字符串 如果不在同一个对象的话，也不一样
        //如果要判断两个字符串的值是否相等  使用 equals 方法
        //字符串拼接  字符串+字符串=合并后的字符串 禁止使用 （很烂的代码）

        /**
         * 1、String 是不可变的字符串
         * 2、String 底层是char数组
         * 3、String 对比不能用 ==  要用 equals 方法
         * 4、String 用 += 的方式拼接字符串是很难的代码
         * */

        /**
         *      动态添加字符串
         *      StringBuffer      StringBuilder
         *
         *      StringBuffer   线程安全     性能差
         *      StringBuilder  非线程安全
         *      大多数时候都用StringBuilder
         *      如果有多线程拼接同一个字符串的场景 使用 StringBuffer
         *
         * */
        StringBuffer stringBuffer = new StringBuffer("a");
        stringBuffer.append("b");
        stringBuffer.append("11");
        System.out.println(stringBuffer.toString());

       /* String a="10";
        method(a);
        System.out.println(a);*/
      /* String a="123";
       String b="123";
        System.out.println(a.equals(b));*/
       /* String a = new String("abc");
        String b = new String("abc");
        System.out.println(a==b);//a 、b 存放的是地址，指向的地址不相同
        System.out.println(a.equals(b));//equals 比较的是两个String数组里面的值，里面的值相同true*/
    }
    public static void method(String a){
        a="200";
    }
}
