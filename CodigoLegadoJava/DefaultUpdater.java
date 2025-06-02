public class DefaultUpdater implements ItemUpdater {
    protected final Item item;

    public DefaultUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.decreaseQuality();
        item.decreaseSellIn();
        if (item.isExpired()) {
            item.decreaseQuality();
        }
    }
}