
public class ItemUpdaterFactory {
    public static ItemUpdater create(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                return new AgedBrieUpdater(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassUpdater(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasUpdater(item);
            default:
                return new DefaultUpdater(item);
        }
    }
}