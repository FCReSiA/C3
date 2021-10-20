package T929.C2;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory femaleFactory =new FemaleFactory();
        HumanFactory maleFactory=new MaleFactory();
        HumanFactory intersexFactory=new IntersexFactory();
        femaleFactory.createBlackHuman().getSex();
        femaleFactory.createWhiteHuman().getSex();
       Human a=femaleFactory.createYellowHuman();
       a.getColor();
       a.talk();
       a.getSex();
       Human b=maleFactory.createWhiteHuman();
       b.getSex();
       b.getColor();
       b.talk();
       Human c=intersexFactory.createYellowHuman();
       c.getColor();
       c.talk();
       c.getSex();
      Human d=maleFactory.createBrownHuman();
       d.getColor();
       d.getSex();
       d.talk();
    }
}
