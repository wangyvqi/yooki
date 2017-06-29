/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package test;

/**
 * 
 * @author wb-wsh296331
 * @version $Id: Pepole.java, v 0.1 2017年6月28日 上午10:57:30 wb-wsh296331 Exp $
 */
public class Pepole {

    private String name;

    public void eat(AbstractFruit fruit) {
        System.out.println("我是" + name + "，现在想吃水果了。");
        Result result = fruit.beforeEat();
        System.out.println("我是" + name + "，我吃了好多---" + result.getMsg());
        fruit.afterEat();
        System.out.println("我是" + name + "，现在想睡觉。");
    }

    /**
     * @param name
     */
    public Pepole(String name) {
        super();
        this.name = name;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

}
