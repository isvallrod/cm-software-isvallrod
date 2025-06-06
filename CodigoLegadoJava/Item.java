package com.gildedrose;

public class Item {

    private String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    // Ejemplo de metodos de comportamiento
    public void increaseQuality() {
        if (quality < 50) quality++;
    }

    public void decreaseQuality() { 
        if (quality > 0) quality--; 
    }

    public void decreaseSellIn() {
        sellIn--;
    }

    public boolean isExpired() { 
        return sellIn < 0; 
    }

    public void resetQuality() {
        quality = 0;
    }


   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
