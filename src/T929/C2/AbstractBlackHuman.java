package T929.C2;

public abstract  class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("BlackH");
    }

    @Override
    public void talk() {
        System.out.println("BlackTalk");
    }


}
