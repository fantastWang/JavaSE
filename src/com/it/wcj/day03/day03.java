package com.it.wcj.day03;

import org.junit.jupiter.api.Test;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/5/13 11:22
 **/
public class day03 {

    /**
      * @Author wangchaojie
      * @Description 当switch case的语句一致时，可以考虑进行合并，减少冗余
      * @Date 17:30 2020/5/13
      **/
    @Test
    public void switchOperation(){
        String str = "123";
        switch (str){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            default:
                System.out.println("4");
                break;
        }
    }
}
