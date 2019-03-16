package com.gupao.strategy;

/**
 * Created by xuhuan on 2019/3/16.
 */
public class Subtract implements Strategy {
    public int calc(int a, int b) {
        return a-b;
    }
}
