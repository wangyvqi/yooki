/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package test;

/**
 * 测试提交
 * yooki--测试下更新冲突问题。
 * @author wb-wsh296331
 * @version $Id: Test.java, v 0.1 2017年6月28日 上午11:03:47 wb-wsh296331 Exp $
 */
public class Test {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        String pwd = "123456";
        Pepole pepole = new Pepole("花花");
        AbstractFruit fruit = new AbstractFruit() {

            @Override
            public Result beforeEat() {
                System.out.println(pwd);
                System.out.println("呜呜呜。。。");
                return new Result("1001", "我是苹果，我被吃了，好痛");
            }

            @Override
            public Result afterEat() {
                System.out.println("我被吃光了，一个渣都不剩。。");
                return null;
            }
        };
        pepole.eat(fruit);
    }

}
