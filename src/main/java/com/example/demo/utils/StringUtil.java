package com.example.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.utils
 * @ClassName: StringUtil
 * @Author: Deng YuBin
 * @Description: 字符串处理
 * @Date: 2020/10/16 11:44
 * @Version: 1.0
 */
public class StringUtil implements Serializable {
    public static String format(String value, Object... paras) {
        return MessageFormat.format(value, paras);
    }
}
