package T929.C1;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> C);
}
