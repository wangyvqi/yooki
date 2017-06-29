/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package test;

/**
 * 
 * @author wb-wsh296331
 * @version $Id: AbstractFruit.java, v 0.1 2017年6月28日 上午10:50:05 wb-wsh296331 Exp $
 */
public abstract class AbstractFruit {

    public abstract Result beforeEat();

    public abstract Result afterEat();

    public void say() {
        System.out.println("这是一个非抽象方法say");
    }
}
