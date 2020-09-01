package com.gildedrose;

public class BackstageItem extends Item {

  public BackstageItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void upgrade() {
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
}
