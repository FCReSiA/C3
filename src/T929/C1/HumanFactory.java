package T929.C1;
import T929.C1.Human;
import T929.C1.AbstractHumanFactory;
public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try{
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("No Human");
        }
        return (T)human;
    }
}
