package com.epam_lab.task8_generics_interfaces2;

public class DiscountProduct extends Product {
    private final Byn discount;

    public DiscountProduct(Byn discount) {
        this.discount = discount;
    }

    public DiscountProduct(String name, Byn price, Byn discount) {
        super(name, price);
        this.discount = discount;
    }

    public DiscountProduct(String name, int price, int discount) {
        this(name, new Byn(price), new Byn(discount));
    }

    @Override
    public Byn getPrice() {
        return super.getPrice().sub(discount);
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}
