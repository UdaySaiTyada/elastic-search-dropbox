package com.borneo.app.utils;

import com.borneo.app.data.response.BaseResponse;
import com.borneo.app.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static com.borneo.app.constants.Constants.*;
import static com.borneo.app.constants.Constants.INTERNAL_SERVER_ERROR_CODE;

@Slf4j
public class ResponseUtil<T> {

    public ResponseEntity<BaseResponse<T>> getResponse(IResponse<T> r){
        try{
            return new ResponseEntity<>(new BaseResponse<>(SUCCESS_STATUS_CODE, SUCCESS_MESSAGE, r.exec()), HttpStatus.OK);
        }
        catch (ApiException ex){
            log.error("API Exception thrown ",ex);
            if(ex.getHttpStatusCode() != null)
            {
                return new ResponseEntity<>(new BaseResponse<>(ex.getHttpStatusCode().value(), ex.getMessage()),ex.getHttpStatusCode());
            }
            return new ResponseEntity<>(new BaseResponse<>(NOT_FOUND_CODE, ex.getMessage()),HttpStatus.NOT_FOUND);
        }
        catch (Exception ex){
            log.error("Generic Exception thrown ",ex);
            return new ResponseEntity<>(new BaseResponse<>(INTERNAL_SERVER_ERROR_CODE, ex.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
