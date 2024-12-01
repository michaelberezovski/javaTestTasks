package clothes;

public enum Sizes {
    XXS(32), XS(34), S(36), M(38), L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getSize() {
        if(euroSize == 32) {
            return "детский размер";
        } else {
            return "взрослы размер";
        }
    }
}
