package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
               
            switch (item.getName()) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePass(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateNormalItem(item);
            }
        }
    }

    private void updateNormalItem(Item item) {
        item.decreaseQuality();
        item.decreaseSellIn();
        if (item.isExpired()) {
            item.decreaseQuality();
        }
    }

    private void updateAgedBrie(Item item) {
        item.increaseQuality();
        item.decreaseSellIn();
        if (item.isExpired()) {
            item.increaseQuality();
        }
    }

    private void updateBackstagePass(Item item) {
        item.increaseQuality();
        if (item.getSellIn() <= 10) item.increaseQuality();
        if (item.getSellIn() <= 5) item.increaseQuality();

        item.decreaseSellIn();
    }

 }
