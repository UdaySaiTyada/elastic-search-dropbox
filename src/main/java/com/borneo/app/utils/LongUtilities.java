package com.borneo.app.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongUtilities
{
    public static boolean isBlankOrZero(Long number)
    {
        if(number == null)
            return true;
        else if(number == 0)
            return true;
        else
            return false;
    }
}
