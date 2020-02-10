package com.test;

public class MyText {
    public static void main(String[] args) {
        /*判断是不是闰年
        int year=300;
        if((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }*/
        /*do循环
        int a = 0;
        do{
            System.out.println("跑");
            a++;
        } while(a<10);*/
        /*for循环
        for(int i=0;i<10;i++){
            System.out.println("跑");
        }*/
        /*int sum = 0;
        for(int i = 1;i<101;i++){
            sum = sum + i;
        }
        System.out.println(sum);*/
        /*i+=10和i=i+10的区别是：*/
        Person p1 = new Person();
        int c = p1.add(5,1);
        System.out.println(c);
        Person p2 = new Person();
        int d = p2.add(6,10);
        System.out.println(d);
    }
}
