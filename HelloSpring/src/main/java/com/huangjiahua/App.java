package com.huangjiahua;

import com.huangjiahua.exercise.ArithmeticCalculator;
import com.huangjiahua.exercise.ArithmeticCalculatorImpl;
import com.huangjiahua.exercise.ArithmeticCalculatorLogging;
import com.huangjiahua.model.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        System.out.println(hello.toString());
//        ArithmeticCalculatorLogging.getTargetProxy(new ArithmeticCalculatorImpl()).add(1, 2);
//        int add = new ArithmeticCalculatorImpl().add(1, 2);
//        System.out.println(add);
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
        System.out.println(arithmeticCalculator.add(2,3));
        System.out.println("******************************");
        System.out.println(arithmeticCalculator.div(2,1));
        System.out.println("******************************");
//        System.out.println(arithmeticCalculator.div(2,0));
    }
}
