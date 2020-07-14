package com.okay.core.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceUtils {

    public static String getMessageKey(String key, Locale locale) {
        ResourceBundle words = ResourceBundle.getBundle("messages", locale);
        return words.getString(key);
    }
}