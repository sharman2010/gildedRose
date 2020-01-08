public class Item {
    private int quality;
    private int sellIn;


    public Item( int quality, int sellIn) {
        if (quality > 50 || quality < 0)
            throw new IllegalArgumentException("Make sure valid values are passed : Quality must be between 0 and 50");
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
}