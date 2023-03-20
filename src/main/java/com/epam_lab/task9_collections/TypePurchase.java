package com.epam_lab.task9_collections;

import java.util.Locale;

public enum TypePurchase {
    GENERAL_PURCHASE,
    DISCOUNT_PURCHASE;

    @Override
    public String toString() {

        return name().toLowerCase(Locale.ROOT);
    }

}