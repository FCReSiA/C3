package T929.C2;

public abstract  class AbstractBrownHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("BrownH");
    }

    @Override
    public void talk() {
        System.out.println("BrownTalk");
    }


}
