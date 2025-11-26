package com.example.couriermanagement.util;

import org.springframework.stereotype.Component;

@Component
public class UserValidator {
    private int errorCount = 0;

    public void validateUserId(Long userId) {
        if (userId == null || userId <= 0) {
            errorCount++;
            throw new IllegalArgumentException("Invalid user ID");
        }
    }

    public void validateUserRole(Long roleOrdinal) {
        if (roleOrdinal == null || roleOrdinal < 0 || roleOrdinal > 2) {
            errorCount++;
            throw new IllegalArgumentException("Invalid role");
        }
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void resetErrorCount() {
        errorCount = 0;
    }
}