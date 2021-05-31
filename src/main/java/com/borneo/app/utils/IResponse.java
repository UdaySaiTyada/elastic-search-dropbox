package com.borneo.app.utils;

public interface IResponse<T> {

    T exec() throws Exception;

}
