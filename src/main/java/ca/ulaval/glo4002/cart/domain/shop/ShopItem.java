package ca.ulaval.glo4002.cart.domain.shop;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({StandardShopItem.class, PrimeShopItem.class})
public abstract class ShopItem {
    protected String sku;

    private ShopItem() {
        // JAXB
    }

    ShopItem(String sku) {
        this.sku = sku;
    }

    public abstract String getName();

    public abstract boolean isAvailable();

    public boolean hasSku(String sku) {
        return this.sku.equals(sku);
    }

    public abstract int getPrice();

    public abstract int getWeight();

    public abstract int getShippingPrice();

    public abstract int getTotalPrice();
}
