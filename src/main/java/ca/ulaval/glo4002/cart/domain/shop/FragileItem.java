package ca.ulaval.glo4002.cart.domain.shop;

public class FragileItem extends ShopItem {
    public static final int SHIPPING_PRICE_PER_KG = 3;
    public static final int SHIPPING_FLAT_FEE = 5;

    private String name;
    private boolean available;
    private int price;
    private int weight;

    public FragileItem(String sku, String name, boolean available, int price, int weight) {
        super(sku);
        this.name = name;
        this.available = available;
        this.price = price;
        this.weight = weight;
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
        return weight * SHIPPING_PRICE_PER_KG + SHIPPING_FLAT_FEE;
    }

    @Override
    public int getTotalPrice() {
        return getPrice() + getShippingPrice();
    }
}
