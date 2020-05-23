package com.it.wcj.day01;

import org.junit.Test;

/**
 * @author wangchaojie
 * @Description 数据类型、进制学习
 * @Date 2020/4/30 14:45
 **/
public class day01 {

    /**
     * @Author wangchaojie
     * @Description 当容量小的与容量大的数据类型进行运算时，结果自动提升到容量大的数据类型
     * byte、char、short-->int-->long-->float-->double
     * 注意!!!byte、char、short三者互相做运算，或者自己跟自己运算时，结果都为int型
     * @Date 15:10 2020/5/9
     **/
    @Test
    public void mathOperation() {
        byte b = 10;
        char c = 'a';
        short s = 20;
        //char+byte
        int i = c + b;
        //short+byte
        int i1 = s + b;
        //short+char
        int i2 = s + c;
    }

    /**
     * @Author wangchaojie
     * @Description 输出* *
     * @Date 13:19 2020/5/11
     **/
    @Test
    public void stringOperation() {
        //单引号是char字符，使用+会变成算术运算
        System.out.println('*' + '\t' + '*');
        //当+前后有一个是字符串时，+就代表时连接符，而不是运算符
        System.out.println('*' + "\t" + '*');
    }

    /**
     * @Author wangchaojie
     * @Description 不同进制之间的表示
     * @Date 16:25 2020/5/11
     **/
    @Test
    public void intoSystem() {
        //二进制，以0b或0B开头
        int a1 = 0b10;
        //八进制，以0开头
        int a2 = 010;
        //十进制
        int a3 = 10;
        //十六进制，以0x或0X开头
        int a4 = 0x10;
        System.out.println(a1 + "-" + a2 + "-" + a3 + "-" + a4);
    }
}
