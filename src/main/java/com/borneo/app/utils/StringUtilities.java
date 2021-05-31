package com.borneo.app.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtilities {
    public static String removeAllSpaces(String input) {
        return input.replaceAll("\\s", "");
    }

    public static boolean isBlank(String text) {
        if (text == null)
            return true;
        else if (text.length() == 0)
            return true;
        else if (text.trim().length() == 0)
            return true;
        else
            return false;
    }
}
