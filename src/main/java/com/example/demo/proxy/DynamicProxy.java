package com.example.demo.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.proxy
 * @ClassName: DynamicProxy
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/4/14 10:32
 * @Version: 1.0
 */
public class DynamicProxy {
    private Object obj;

    public Object bind(Object obj){
        this.obj = obj;
        Object proxy = Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                (proxy1, method, args) -> {
                    System.out.println("方法" + method.getName() + "正在执行");
                    Object result = method.invoke(obj, args);
                    System.out.println("方法" + method.getName() + "执行完毕");
                    return result;
                });
        return proxy;
    }

    @Test
    public void testDynamicProxy(){
        Monkey monkey = new Monkey();
        DynamicProxy dynamicProxy = new DynamicProxy();

        Yeal yeal = (Yeal)dynamicProxy.bind(monkey);
        yeal.sound();
    }
}
