package com.example.couriermanagement.util;

import org.springframework.stereotype.Component;

@Component

public class UserProcessor {
    private final UserValidator userValidator;
    private final GlobalSettings globalSettings;

    public UserProcessor(UserValidator userValidator, GlobalSettings globalSettings) {
        this.userValidator = userValidator;
        this.globalSettings = globalSettings;
    }

    public void processUser(Long userId) {
        userValidator.validateUserId(userId);
        globalSettings.set("user_" + userId, "processed");
    }
}