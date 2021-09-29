package T929.C2;

public class IntersexFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new IntersexYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new IntersexWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new IntersexBlackHuman();
    }


    public Human createBrownHuman() { return new IntersexBrownHuman(); }
}
