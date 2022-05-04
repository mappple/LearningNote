package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyImageDynamic implements InvocationHandler {
    private Image realImage;

    public ProxyImageDynamic(Image realImage) {
        this.realImage = realImage;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(realImage, args);
        return result;
    }

    //生成代理对象
    public static Object factory(Image realSubject) {
        Class<?> realObjClass = realSubject.getClass();
        return Proxy.newProxyInstance(realObjClass.getClassLoader(),
                realObjClass.getInterfaces(), new ProxyImageDynamic(realSubject));
    }
}
