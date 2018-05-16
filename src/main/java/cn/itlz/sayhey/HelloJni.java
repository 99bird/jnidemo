package cn.itlz.sayhey;

/**
 * @author Pogx
 * Date: 2018/5/14
 */
public class HelloJni {
    public native void hello();

    public static void main(String[] args) {
        System.load("D:\\IntelliJ IDEA workspace\\jnidemo\\target\\classes\\lib\\HelloJni.dll");
        HelloJni helloJni = new HelloJni();
        helloJni.hello();
    }
}
