package T929.C2;

public abstract  class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("WhiteH");
    }

    @Override
    public void talk() {
        System.out.println("whiteTalk");
    }

}
