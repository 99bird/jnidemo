package cn.test;

/**
 * @author Pogx
 * Date: 2018/5/14
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> test1Class = Class.forName("cn.test.Test1");
        Class<?> aClass = Thread.currentThread().getContextClassLoader().loadClass("cn.test.Test1");
    }
}
class Test1{
    static {
        System.out.println("initlized!");
    }

    public final static String complieConst = "testjava";
}