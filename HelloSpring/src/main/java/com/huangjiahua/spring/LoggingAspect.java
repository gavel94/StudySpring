package com.huangjiahua.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by huangjiahua on 2016/9/9.
 */
@Order (1) // order指定切面优先级，值越小 优先级越高
@Aspect
@Component
public class LoggingAspect
{
    @Pointcut("execution(* com.huangjiahua.exercise.ArithmeticCalculatorImpl.*(..))")
    public void decareJointPointExpression(){}

    @Before("decareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
    }

    @After("decareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("The method " + methodName + " end with " + Arrays.asList(args));
    }

    @AfterReturning(value = "decareJointPointExpression()",
            returning = "result")
    public void afterReturnMeathod(JoinPoint joinPoint, Object result)
    {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("The method " + methodName + " end with " + Arrays.asList(args) + " result = " + result);
    }

    @AfterThrowing(value = "decareJointPointExpression()",
            throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e)
    {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("The method " + methodName + " throwing " + Arrays.asList(args) + e);
//        e.printStackTrace();
    }

//    @Around(value = "execution(* com.huangjiahua.exercise.ArithmeticCalculatorImpl.*(..))")
//    public Object aroundMethod(ProceedingJoinPoint point)
//    {
//        String methodName = point.getSignature().getName();
//        Object[] args = point.getArgs();
//        Object result = null;
//
//        try
//        {
//            //前置通知
//            System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
//            result = point.proceed();
//            System.out.println("The method " + methodName + " AfterReturning " + Arrays.asList(args) + " result = " + result);
//            //返回通知
//        } catch (Throwable throwable)
//        {
//            throwable.printStackTrace();
//            //异常通知
//            System.out.println("The method " + methodName + " throwing " + Arrays.asList(args) + throwable);
//        }
//        //后置通知
//        System.out.println("The method " + methodName + " After " + Arrays.asList(args));
//        return result;
//
//    }


}
