package T1006.C1;

public class GamePlayerProxy implements IGamePlayer
{
    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player)
    {
        this.player = player;
    }

    @Override
    public void login(String user, String password)
    {
        this.player.login(user,password);
    }

    @Override
    public void killBoss()
    {
        this.player.killBoss();
    }

    @Override
    public void upgrade()
    {
        this.player.upgrade();
    }
}