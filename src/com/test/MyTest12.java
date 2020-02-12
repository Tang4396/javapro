package com.test;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;

public class MyTest12 {
    public static void main(String[] args) {


        /*int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("卓越一班");*/
        /*
        * java中的数据在运行的时候，是保存在内存中的
        * 当进程结束的时候，内存中的数据会全部释放
        * 如果想保存当前进程下的数据，我们就必须把数据放到一个能一直保存的地方
        * 如果想保存住了，就必须把我们的当前进程中的数据（内存）保存到硬盘下  让数据能够持久的保存，这个技术叫数据持久化
        * 也就是说将数据从内存中转移到硬盘中，这一过程叫数据的输出
        * 那么下次运行的时候，我们要读上一次保存的数据作为初始数据
        * 也就是将数据从硬盘中 读到内存中 这一过程叫做数据的输入
        * IO流  按照方向分
        *        输入流：把其他地方存到内存里
        *        输出流
        *  IO流 按照传输单位分为两种
        *         字节流
        *              构成文件的最小单位就是字节（如果是一个中文（占两字节）如果传了一个字节  传输失败 那么可能会出现错误，形成乱码）
        *              视频文件图片都是字节流，只有文字是字符流
        *         字符流
        *              所以传输文本信息   需要用字符流
        *         两者的区别在于：字节流以byte为单位    字符流以2byte的unicode为单位
        *
        *     流属于对资源的操作，所以必须要关闭
        *        write是将数据放到管道里   flush是将管道中的东西压入到文件里
        *
        * */
        /*
        *字节输出流
        * OutputStream是抽象的  不能实例化
        * 路径的写法  盘符：/文件夹：/文件名
        * 路径之间用/分隔，或者\\分隔
        *
        * File  对象只能提供文件的信息描述  并不能对文件进行任何读写操作
        *    输出流默认将内容写入文件中（覆盖原文件）如果想保留原先的文件
        *    我们在构造的时候就必须设置为追加内容   而不是覆盖内容   后面加true
        *
        *   字节输入流读文件
        *        read返回的是读了多少
        * */

        File file = new File("d:/Animal.java");
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] a = new byte[200];
            System.out.println(inputStream.read(a));
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




        /*try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\nsfasdf";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
//        System.out.println(file.getName());
        //getName获取文件的文件名
//        System.out.println(file.length());
        //获取文件大小，单位是字节
//        System.out.println(file.exists());
        //exists查看文件是否存在
//        System.out.println(file.getPath());
        //查看文件路径
        /*try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //createNewFile创建文件，返回是否成功       方法内有异常的话，需要处理异常，自己加上了try/catch处理
        /*System.out.println(file.mkdir());*/
        //创建目录  mkdir只创建目录的最后一级，必须保证前面的父目录都是存在的
        //mkdirs创建所有的，不存在自动创建
        //System.out.println(file.delete());F
        //删除所选文件
        //System.out.println(file.isDirectory());//判断是否是目录  isile是否是文件

        //OutputStream outputStream = new FileOutputStream()
    }
}
