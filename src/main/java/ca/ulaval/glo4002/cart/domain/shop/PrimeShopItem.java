package ca.ulaval.glo4002.cart.domain.shop;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrimeShopItem extends ShopItem {
    public static final int SHIPPING_PRICE_PER_KG = 0;

    @XmlElement
    @JsonProperty
    private String name;

    @XmlElement
    @JsonProperty
    private boolean available;

    @XmlElement
    @JsonProperty
    private int price;

    @XmlElement
    @JsonProperty
    private int weight;

    @XmlElement
    @JsonProperty
    // Ne pas enlever @JsonProperty, ceci sert pour le panneau d'admin où on saisit les items
    private double profitMarginPercentage;

    private PrimeShopItem() {
        // JAXB
    }

    public PrimeShopItem(String sku, String name, int price, int weight, double
            profitMarginPercentage,
                         boolean available) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.profitMarginPercentage = profitMarginPercentage;
        this.available = available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getShippingPrice() {
        return SHIPPING_PRICE_PER_KG;
    }

    @Override
    public int getTotalPrice() {
        return getShippingPrice();
    }
}
