package T929.C1;
import T929.C1.Human;
import T929.C1.BlackHuman;
import T929.C1.HumanFactory;
import T929.C1.WhiteHuman;
import T929.C1.YellowHuman;
import T929.C1.AbstractHumanFactory;
public class NvWa {
    public static void main(String[] args){
        AbstractHumanFactory BaGuaLu = new HumanFactory();
        System.out.println("T0:White");
        Human whiteHuman = BaGuaLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("T1:Black");
        Human blackHuman = BaGuaLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("T2:Yellow");
        Human yellowHuman = BaGuaLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
