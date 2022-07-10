package com.newsoftdemo.day01.utils;

import java.io.UnsupportedEncodingException;

/**
 * @description（类描述）: 工具箱
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.utils
 * @className（类名称）: Utils
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 22:43
 * @version（版本）: v1.0
 */
public class Utils {
    /***
     * @param source：源字符串
     * @description：字符串转换为UTF8
     * @author：冯孝刚
     * @createDate（创建时间）：2022-07-09 22:46:03
     * @methodsName（方法名称）: stringToUTF8
     * @return（返回类型）: java.lang.String 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    public static String stringToUTF8(String source) throws UnsupportedEncodingException {
        String result = new String(source.getBytes(), "utf-8");
        return result;
    }
}
