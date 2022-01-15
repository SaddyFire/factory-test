package com.saddyfire.controller;

import com.saddyfire.factory.Product;
import com.saddyfire.factory.SimpleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SaddyFire
 * @date 2022/1/10
 * @TIME:14:51
 */
@RestController
@RequestMapping("/login")
public class Login {

    @Autowired
    private SimpleFactory simpleFactory;

    @GetMapping("/{type}")
    public void factoryTest(@PathVariable("type") Integer type){
        Product product = simpleFactory.createProduct(type);
        product.excute();
    }

}
