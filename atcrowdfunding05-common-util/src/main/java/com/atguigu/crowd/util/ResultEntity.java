package com.atguigu.crowd.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ezuy
 * @date 21/6/29 21:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity<T> {

    public static final String SUCCESS = "SUCCESS";
    public static final String Failed = "Failed";

    private String result;

    private String message;

    private T data;

    public static <Type> ResultEntity<Type> successWithoutData() {
        return new ResultEntity(SUCCESS, null, null);
    }

    public static <Type> ResultEntity<Type> successWithData(Type data) {
        return new ResultEntity(SUCCESS, null, data);
    }

    public static <Type> ResultEntity<Type> failed(String message) {
        return new ResultEntity<>(Failed, message, null);
    }


}