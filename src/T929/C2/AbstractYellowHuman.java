package T929.C2;

public abstract  class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("YellowH");
    }

    @Override
    public void talk() {
        System.out.println("YellowTalk");
    }
}
