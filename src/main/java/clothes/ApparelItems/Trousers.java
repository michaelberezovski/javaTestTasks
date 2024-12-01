package clothes.ApparelItems;

import clothes.ApparelInterface.MenApparel;
import clothes.ApparelInterface.WomenApparel;
import clothes.Sizes;

public class Trousers extends AbstractApparel implements MenApparel, WomenApparel {
    public Trousers(Sizes size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMen() {
        System.out.println(getClass());
    }

    @Override
    public void dressWomen() {System.out.println(getClass());
    }
}
