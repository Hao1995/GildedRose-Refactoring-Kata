package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                continue;
            }

            if (item.name.equals("Aged Brie")) {
                upgrdaeAged(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                upgradeBackstage(item);
            } else {
                upgradeNormal(item);
            }
        }
    }

    public void upgradeNormal(Item item) {
        item.sellIn = item.sellIn - 1;
        item.decreaseQuality();
        if (item.sellIn < 0) {
            item.decreaseQuality();
        }
    }

    public void upgradeBackstage(Item item) {
        item.sellIn = item.sellIn - 1;
        item.increaseQuality();
        if (item.sellIn < 10) {
            item.increaseQuality();
        }
        if (item.sellIn < 5) {
            item.increaseQuality();
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    public void upgrdaeAged(Item item) {
        item.sellIn = item.sellIn - 1;
        item.increaseQuality();
        if (item.sellIn < 0) {
            item.increaseQuality();
        }
    }

}