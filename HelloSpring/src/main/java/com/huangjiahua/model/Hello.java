package com.huangjiahua.model;

/**
 * Created by huangjiahua on 2016/9/7.
 */
public class Hello {
    public Hello() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
