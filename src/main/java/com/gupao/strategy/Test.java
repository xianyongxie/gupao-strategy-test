package com.gupao.strategy;

/**
 * Created by xuhuan on 2019/3/16.
 */
public class Test {

    //用哪个，传入哪个策略类
    public static void main(String[] args) {
        Add add = new Add();
        Environment environment = new Environment(add);
        System.out.println("加法策略："+environment.calulate(100,50));

        Subtract subtract = new Subtract();
        environment = new Environment(subtract);
        System.out.println("减法策略："+environment.calulate(100,50));
    }


}
