package com.snda.sysdev.bean;

import java.io.Serializable;

/**
 * @author liudong.leo
 * @since 2013-02-25 14:00
 */
public class Child implements Serializable {
    private Integer id;
    private String name;
    private Parent parent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
