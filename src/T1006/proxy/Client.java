package T1006.proxy;

import java.util.Date;

public class Client
{
    public static void main(String[] args)
    {
        IGamePlayer player = new GamePlayer("阿伟");
        IGamePlayer proxy = new GamePlayerProxy(player);

        System.out.println("开始游戏时间:" + new Date());
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束游戏时间:" + new Date());
    }
}