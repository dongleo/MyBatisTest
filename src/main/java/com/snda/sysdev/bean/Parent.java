package com.snda.sysdev.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author liudong.leo
 * @since 2013-02-25 13:59
 */
public class Parent implements Serializable {
    private Integer id;
    private String name;
    private List<Child> children;

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

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
