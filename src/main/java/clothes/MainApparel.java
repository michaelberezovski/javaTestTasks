package clothes;

import clothes.ApparelItems.*;

import java.util.ArrayList;

public class MainApparel {
    public static void main(String[] args) {
        ArrayList<AbstractApparel> apparels = new ArrayList<>();
        apparels.add(new T_shirt(Sizes.XXS, 100, "yellow"));
        apparels.add(new T_shirt(Sizes.XS, 101, "yellow"));
        apparels.add(new T_shirt(Sizes.S, 102, "yellow"));
        apparels.add(new T_shirt(Sizes.M, 103, "yellow"));
        apparels.add(new T_shirt(Sizes.L, 104, "yellow"));
        apparels.add(new Skirt(Sizes.XXS, 105, "yellow"));
        apparels.add(new Skirt(Sizes.XS, 106, "yellow"));
        apparels.add(new Skirt(Sizes.S, 107, "yellow"));
        apparels.add(new Trousers(Sizes.S, 112, "yellow"));
        apparels.add(new Trousers(Sizes.M, 113, "yellow"));
        apparels.add(new Trousers(Sizes.L, 114, "yellow"));
        apparels.add(new Tie(Sizes.M, 118, "yellow"));
        apparels.add(new Tie(Sizes.L, 119, "yellow"));
    }

    private static void dressMen(ArrayList<AbstractApparel> list) {
        for (AbstractApparel a : list) {
        }
    }

    private static void dressWomen(ArrayList<AbstractApparel> list) {
        for (AbstractApparel a : list) {
        }
    }
}
