/*
 * 创建日期：2020年4月1日 上午1:13:31
 * 创  建  人：zhang.qiangqiang
 * 修改历史：
 *     1. [2020年4月1日]创建文件 by zhang.qiangqiang
 */

package com.qiang.test.restfull.tomcat.model;

/**
 * TODO（添加类/接口功能描述）
 * 
 * @author zhang.qiangqiang 2020年4月1日 上午1:13:31
 *
 */
public class Child {
    
    private String id;
    
    private String name;
    
    private int old;
    
    private String address;

    /**
     * TODO（添加描述）
     * @param id
     * @param name
     * @param old
     * @param address
     */
    public Child(String id, String name, int old, String address) {
        super();
        this.id = id;
        this.name = name;
        this.old = old;
        this.address = address;
    }

    /**
     * 获取 #{bare_field_comment}
     * @return the id
     */
    public String getId() {
        return id;
    }
    

    /**
     * 设置 #{bare_field_comment}
     * @param id #{bare_field_comment}
     */
    public void setId(String id) {
        this.id = id;
    }
    

    /**
     * 获取 #{bare_field_comment}
     * @return the name
     */
    public String getName() {
        return name;
    }
    

    /**
     * 设置 #{bare_field_comment}
     * @param name #{bare_field_comment}
     */
    public void setName(String name) {
        this.name = name;
    }
    

    /**
     * 获取 #{bare_field_comment}
     * @return the old
     */
    public int getOld() {
        return old;
    }
    

    /**
     * 设置 #{bare_field_comment}
     * @param old #{bare_field_comment}
     */
    public void setOld(int old) {
        this.old = old;
    }
    

    /**
     * 获取 #{bare_field_comment}
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    

    /**
     * 设置 #{bare_field_comment}
     * @param address #{bare_field_comment}
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /* 
     * zhang.qiangqiang 2020年4月1日 上午1:14:16
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Child [id=" + id + ", name=" + name + ", old=" + old + ", address=" + address + "]";
    }
    
    
    

}
