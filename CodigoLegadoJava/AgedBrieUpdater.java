import com.gildedrose.Item;

public class AgedBrieUpdater extends DefaultUpdater {

    public AgedBrieUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.increaseQuality();
        item.decreaseSellIn();
        if (item.isExpired()) {
            item.increaseQuality();
        }
    }
}