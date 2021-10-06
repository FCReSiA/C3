package T1006.C2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public class Client {
    public static void main(String[] args) {
        IGamePlayer gp = new GamePlayer("阿伟");
        InvocationHandler gpHandler = new GamePlayerInvocationHandler(gp);
        //获取真实主题类的ClassLoader
        ClassLoader classLoader = gp.getClass().getClassLoader();
        //动态产生一个代理者。
        Class<?>[] cls = new Class[]{IGamePlayer.class};
        IGamePlayer proxyGp = (IGamePlayer) Proxy.newProxyInstance(classLoader, cls, gpHandler);
        proxyGp.login("awei", "123456");
        proxyGp.killBoss();
        proxyGp.upgrade();
    }
}