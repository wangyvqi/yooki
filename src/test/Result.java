/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package test;

/**
 * 
 * @author wb-wsh296331
 * @version $Id: Result.java, v 0.1 2017年6月28日 上午10:51:40 wb-wsh296331 Exp $
 */
public class Result {
    private String code;
    private String msg;

    /**
     * @param code
     * @param msg
     */
    public Result(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     * 
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for property <tt>msg</tt>.
     * 
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
