import com.gildedrose.Item;

public class BackstagePassUpdater extends DefaultUpdater {

    public BackstagePassUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.increaseQuality();
        if (item.getSellIn() <= 10) item.increaseQuality();
        if (item.getSellIn() <= 5) item.increaseQuality();
        item.decreaseSellIn();
        if (item.isExpired()) item.resetQuality();
    }
}