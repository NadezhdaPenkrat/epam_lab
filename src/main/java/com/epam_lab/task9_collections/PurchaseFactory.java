package com.epam_lab.task9_collections;

import java.util.Scanner;

public class PurchaseFactory {

    public static Purchase createPurchaseFromFactory(Scanner scanner) {
        String next = scanner.next();
        Purchase purchase = null;
        String[] arr = next.split(";");
        if (arr.length == 3) {
            purchase = new Purchase(arr[0], arr[1], arr[2]);
        } else {
            purchase =  new PricePurchase(arr[0], arr[1], arr[2], arr[3]);
        }
        return purchase;
    }

}
