package com.example.couriermanagement.util;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component

public class DeliveryCache {
    private Map<Long, String> deliveryCache = new HashMap<>();

    public void put(Long key, String value) {
        deliveryCache.put(key, value);
    }

    public String get(Long key) {
        return deliveryCache.get(key);
    }

    public boolean contains(Long key) {
        return deliveryCache.containsKey(key);
    }

    public void remove(Long key) {
        deliveryCache.remove(key);
    }

    public void clear() {
        deliveryCache.clear();
    }
}