package easypattern.adapter;

/**
 * Created by CoT on 10/16/17.
 */
public class VeryOldShopAdapter implements Shop {

    private VeryOldShop oldShop = new VeryOldShop();

    public void sell() {
        oldShop.soldAnItem();
    }
}
