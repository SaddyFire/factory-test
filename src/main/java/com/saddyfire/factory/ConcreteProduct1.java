package com.saddyfire.factory;


/**
 * 生产类
 * @author SaddyFire
 * @date 2022/1/10
 * @TIME:14:55
 */
public class ConcreteProduct1 implements Product{

    @Override
    public void excute(){
        System.out.println("生产者1开始工作");
    }

}
