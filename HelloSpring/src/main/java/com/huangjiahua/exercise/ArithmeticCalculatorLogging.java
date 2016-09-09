package com.huangjiahua.exercise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by huangjiahua on 2016/9/8.
 */
public class ArithmeticCalculatorLogging implements InvocationHandler
{

    private ArithmeticCalculator target;

    public ArithmeticCalculatorLogging(ArithmeticCalculator target)
    {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("方法名" + method.getName() +"参数:"+ Arrays.toString(args));
        Object result = null;

        try
        {
            //前置通知
            result = method.invoke(target, args);
            //返回通知  可以获取到返回值
        } catch (Exception e)
        {
            e.printStackTrace();
            //异常通知
        }
        //后置通知
        System.out.println("返回值：" + result);
        return result;
    }

    public static ArithmeticCalculator getTargetProxy(ArithmeticCalculator target)
    {
        return (ArithmeticCalculator) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new ArithmeticCalculatorLogging(target));
    }
}
