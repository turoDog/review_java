package com.nasus.generic.why;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic <br/>
 * Date:2019/12/28 21:18 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Add {

    private static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    // 一个泛型方法
    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        Add.add(1, 2);
        Add.add(1f, 2f);
        Add.add(1d, 2d);
        System.out.println("--------------------------");
        // 以下三个都是调用泛型方法
        Add.add(Integer.valueOf(1), Integer.valueOf(2));
        Add.add(Float.valueOf(1), Float.valueOf(2));
        Add.add(Double.valueOf(1), Double.valueOf(2));
    }

}
