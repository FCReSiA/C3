package T1006.C4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;



public class HouseBuyer {

    public void buyHouseByDynamicProxyForJdk() {
        //被代理的对象：房主接口
        IHouseOwner owner = new HouseOwner();

        //被代理对象的接口加载器
        ClassLoader classLoader = IHouseOwner.class.getClassLoader();

        //被代理的接口的类型
        Class[] classes = {IHouseOwner.class};

        //代理时的调用处理器：房租中介
        InvocationHandler proxyHandler = new HouseAgentByDynamicForJdk(owner);

        //代理对象
        IHouseOwner proxy = (IHouseOwner) Proxy.newProxyInstance(classLoader, classes, proxyHandler);

        //代理售房
        proxy.tradeHouse();
    }
}
