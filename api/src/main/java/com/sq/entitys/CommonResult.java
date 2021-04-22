package com.sq.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午11:04
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code;
    private String message;
    private T data;

    public CommonResult (Integer code, String message){
        this(code,message,null);
    }
}
