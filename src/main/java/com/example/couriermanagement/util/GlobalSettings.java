package com.example.couriermanagement.util;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component

public class GlobalSettings {
    private Map<String, Object> globalSettings = new HashMap<>();

    public void set(String key, Object value) {
        globalSettings.put(key, value);
    }

    public Object get(String key) {
        return globalSettings.get(key);
    }

    public boolean contains(String key) {
        return globalSettings.containsKey(key);
    }

    public void remove(String key) {
        globalSettings.remove(key);
    }

    public Map<String, Object> getAllSettings() {
        return new HashMap<>(globalSettings);
    }
}