package com.gildedrose;

public class AgedItem extends Item {

  public AgedItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void upgrade() {
    sellIn = sellIn - 1;
    increaseQuality();
    if (sellIn < 0) {
      increaseQuality();
    }
  }
}
