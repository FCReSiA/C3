package T1006.C3;

import java.util.logging.Logger;

public class HouseOwner implements IHouseOwner {

    @Override
    public void tradeHouse(Logger log) {
        log.info("房屋交易");
    }
}
