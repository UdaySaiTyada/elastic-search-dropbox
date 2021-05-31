package com.borneo.app.utils;

import com.borneo.app.constants.Constants;
import com.borneo.app.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import java.text.DecimalFormat;
import java.util.Base64;

@Slf4j
public class Utilities {
    private static DecimalFormat df = new DecimalFormat("###.##");

    public static Pageable getPageRequest(int pageNumber, int pageSize) throws ApiException {
        if (pageNumber <= 0) {
            log.error(Constants.PAGE_NUMBER_MUST_NOT_BE_LESS_THAN_1);
            throw new ApiException(Constants.PAGE_NUMBER_MUST_NOT_BE_LESS_THAN_1, HttpStatus.BAD_REQUEST);
        }
        Pageable pageRequest = new PageRequest(pageNumber - 1, pageSize);
        return pageRequest;
    }

    // Base 64 Encode:
    public static String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    //Base 64 Decode:
    public static String decode(String input) {
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        return new String(decodedBytes);
    }
}