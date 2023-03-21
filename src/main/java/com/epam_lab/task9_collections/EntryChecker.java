package com.epam_lab.task9_collections;

import java.util.Map;

public interface EntryChecker<K, V> {
    boolean check(Map.Entry<K, V>  entry);
}

