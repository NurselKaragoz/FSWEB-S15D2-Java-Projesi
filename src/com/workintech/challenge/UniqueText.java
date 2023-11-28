package com.workintech.challenge;

import java.util.Set;

public class UniqueText {
    private String text;
    public String UniqueText(String text) {
        String cleanedText = text.replaceAll("[.,!?\"']", "");
        return cleanedText;
    }
}
