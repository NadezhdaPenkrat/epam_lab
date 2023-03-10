package com.epam_lab.task6_inheritance;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        final Product product = new Product("Asus", new Byn(200000));

        AbstractPurchase[] purchases = {
                new UnitDiscountPurchase(product, 4, new Byn(10000)),
                new UnitDiscountPurchase(product, 8, new Byn(15000)),
                new QuantityDiscountPurchase(product, 12, 30),
                new QuantityDiscountPurchase(product, 20, 42.5),
                new TransportPurchase(product, 3, new Byn(30000)),
                new TransportPurchase(product, 5, new Byn(30000)),
        };

        toPrint(purchases);
        Arrays.sort(purchases);
        toPrint(purchases);
        System.out.printf("Minimum cost = %s\n", purchases[purchases.length - 1].getCost());
        toSearch(purchases);


    }

    private static void toPrint(AbstractPurchase[] purchases) {
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }
        System.out.println();
    }

    protected static String toSearch(AbstractPurchase[] purchases) {

        String message = "Nothing was found";
        Product someProduct = new Product("some product", new Byn(500));
        AbstractPurchase purchaseToSearch = new UnitDiscountPurchase(someProduct, 1, new Byn(0));
        int search = Arrays.binarySearch(purchases, purchaseToSearch);
        if (search >= 0) {
            message = purchases[search].toString();
        }

        return message;

    }


}

