package com.gupao.strategy;

/**
 * Created by xuhuan on 2019/3/16.
 * 环境角色
 */
public class Environment {

    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calulate(int a,int b){
        return strategy.calc(a,b);
    }
}
