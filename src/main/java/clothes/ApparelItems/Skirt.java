package clothes.ApparelItems;

import clothes.ApparelInterface.WomenApparel;
import clothes.Sizes;

public class Skirt extends AbstractApparel implements WomenApparel {

    public Skirt(Sizes size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWomen() {
        System.out.println(getClass());
    }
}
