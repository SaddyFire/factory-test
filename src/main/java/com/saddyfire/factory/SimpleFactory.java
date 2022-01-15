package com.saddyfire.factory;

import org.springframework.stereotype.Component;

/**
 * 简单工厂类
 * @author SaddyFire
 * @date 2022/1/10
 * @TIME:14:57
 */
@Component
public class SimpleFactory {
    public Product createProduct(Integer type){
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        } else if (type == 3) {
            return new ConcreteProduct3();
        }
        throw new RuntimeException("非法参数");
    }

}
