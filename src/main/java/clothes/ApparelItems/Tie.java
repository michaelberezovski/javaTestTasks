package clothes.ApparelItems;

import clothes.ApparelInterface.MenApparel;
import clothes.Sizes;

public class Tie extends AbstractApparel implements MenApparel {

    public Tie(Sizes size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMen() {
        System.out.println(getClass());
    }
}
