package com.borneo.app.constants;

public class RegexConstants {

    public static final String ALL_DIGITS_WITH_OPTIONAL_MINUS = "-?([0-9]*)";
    public static final String HOUR_MINUTE_TIMER = "([0-9]*):([0-9]*)";
    public static final String UUID_FORMAT = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-5][0-9a-fA-F]{3}-[089abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}";
    public static final String VALID_EMAIL = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public static final String VALID_EMAIL_V2 = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
}
