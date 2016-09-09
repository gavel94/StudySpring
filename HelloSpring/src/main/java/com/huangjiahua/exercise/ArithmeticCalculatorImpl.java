package com.huangjiahua.exercise;

import org.springframework.stereotype.Component;

/**
 * Created by huangjiahua on 2016/9/8.
 */

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator
{
    public int add(int i, int j)
    {
        return i + j;
    }

    public int sub(int i, int j)
    {
        return i - j;
    }

    public int mul(int i, int j)
    {
        return i * j;
    }

    public int div(int i, int j)
    {
        return i / j;
    }
}
