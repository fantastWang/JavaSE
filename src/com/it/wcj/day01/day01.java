package com.it.wcj.day01;

import org.junit.jupiter.api.Test;

/**
 * @author wangchaojie
 * @Description 每日主要知识点
 * @Date 2020/4/30 14:45
 **/
public class day01 {

    /**
     * @Author wangchaojie
     * @Description 当容量小的与容量大的数据类型进行运算时，结果自动提升到容量大的数据类型
     * byte、char、short-->int-->long-->float-->double
     * 注意!!!byte、char、short三者互相做运算，或者自己跟自己运算时，结果为int型
     * @Date 15:10 2020/5/9
     **/
    @Test
    public void test01() {
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
}
