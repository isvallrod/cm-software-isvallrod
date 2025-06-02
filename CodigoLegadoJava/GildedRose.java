package com.gildedrose;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    for (Item item : items) {
        ItemUpdater updater = ItemUpdaterFactory.create(item);
        updater.update();
    }
    }

 }
