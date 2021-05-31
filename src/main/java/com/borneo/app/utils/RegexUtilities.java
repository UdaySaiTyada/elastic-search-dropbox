package com.borneo.app.utils;

import com.borneo.app.constants.Constants;
import com.borneo.app.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
public class RegexUtilities
{
    public static boolean isStringOnlyNumbers(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[0-9]*$")));
    }

    public static int getPageNumber(String pageNumberString) throws ApiException {
        try
        {
            return Integer.parseInt(pageNumberString);
        }
        catch (Exception exception)
        {
            log.error(Constants.INVALID_PAGE_NUMBER);
            throw new ApiException(Constants.INVALID_PAGE_NUMBER, HttpStatus.BAD_REQUEST);
        }
    }

    public static int getPageSize(String pageSizeString) throws ApiException {
        try
        {
            return Integer.parseInt(pageSizeString);
        }
        catch (Exception exception)
        {
            log.error(Constants.INVALID_PAGE_Size);
            throw new ApiException(Constants.INVALID_PAGE_Size, HttpStatus.BAD_REQUEST);
        }
    }
}