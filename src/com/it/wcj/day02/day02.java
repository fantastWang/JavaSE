package com.it.wcj.day02;

import org.junit.jupiter.api.Test;

/**
 * @author wangchaojie
 * @Description 运算符
 * @Date 2020/4/30 15:30
 **/
public class day02 {

    /**
     * @Author wangchaojie
     * @Description 运算符操作
     * @Date 14:23 2020/5/12
     **/
    @Test
    public void operator() {
        int num1 = 12;
        int num2 = 5;
        System.out.println(num1 / num2);          //2
        System.out.println(num1 / num2 * num2);   //10
        System.out.println((double) num1 / num2); //2.4
        System.out.println(num1 / (double) num2); //2.4
    }

    /**
     * @Author wangchaojie
     * @Description 取模操作(取余数)：结果的符号和被模数的符号相同
     * @Date 14:35 2020/5/12
     **/
    @Test
    public void modulus() {
        int num1 = 12;
        int num2 = 5;
        System.out.println(num1 % num2);          //2

        int num3 = 12;
        int num4 = -5;
        System.out.println(num3 % num4);          //2

        int num5 = -12;
        int num6 = 5;
        System.out.println(num5 % num6);          //-2

        int num7 = -12;
        int num8 = -5;
        System.out.println(num7 % num8);          //-2
    }

    /**
     * @Author wangchaojie
     * @Description ++操作
     * @Date 15:32 2020/5/12
     **/
    @Test
    public void puls() {
        int a1 = 10;
        int a2 = a1++;
        //先运算，再自增
        System.out.println("a1=" + a1 + "\t" + "a2=" + a2);

        int b1 = 10;
        int b2 = ++b1;
        //先自增，后运算
        System.out.println("b1=" + b1 + "\t" + "b2=" + b2);

        //注意：这里已经改变了数据类型，改成了int型，所以需要强转
        short s1 = 10;
        s1 = (short) (s1 + 1);
        //这里没有改变数据类型，效率较高
        short s2 = 10;
        s2 = s2++;
        s2 += s2; //也不会改变数据类型

        int m = 2;
        int n = 3;
        //n=n*m++  ==>3*(2++)
        n *= m++;
        System.out.println("m=" + m + "n=" + n);

        int n1= 10;
        //n1= n1+(n1++)+(++n1);
        //n1= 10+10+12 n1++的时候已经进行了运算，所以是++n1是12
        n1+=(n1++)+(++n1);
        System.out.println("n1="+n1);
    }

    /**
     * @Author wangchaojie
     * @Description 位运算符：是对整数的二进制进行运算
     * @Date 15:32 2020/5/12
     **/
    @Test
    public void position() {
        //左移 4*2*2
        System.out.println(4<<2);
        //右移 3/2=1
        System.out.println(3>>2);
        //无符号右移 3/2=1
        System.out.println(3>>>1);
    }
}
