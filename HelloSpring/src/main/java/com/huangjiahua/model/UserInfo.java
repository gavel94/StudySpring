package com.huangjiahua.model;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhhuang on 2016/9/9
 * QQ:781913268
 * Description：用户信息
 */
public class UserInfo
{
    private String name;
    private int age;

    public UserInfo()
    {
    }

    public UserInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
