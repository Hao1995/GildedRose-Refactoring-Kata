package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

  public void decreaseQuality() {
      if (quality > 0) {
          quality = quality - 1;
      }
  }

  public void increaseQuality() {
      if (quality < 50) {
          quality = quality + 1;
      }
  }

  public void upgradeNormal() {
      sellIn = sellIn - 1;
      decreaseQuality();
      if (sellIn < 0) {
          decreaseQuality();
      }
  }

  public void upgradeBackstage() {
      sellIn = sellIn - 1;
      increaseQuality();
      if (sellIn < 10) {
          increaseQuality();
      }
      if (sellIn < 5) {
          increaseQuality();
      }
      if (sellIn < 0) {
          quality = 0;
      }
  }

  public void upgrdaeAged() {
      sellIn = sellIn - 1;
      increaseQuality();
      if (sellIn < 0) {
          increaseQuality();
      }
  }
}
