package com.property.bluecard.propertyrechargemeter.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.expression.ParseException;

import java.util.ArrayList;
import java.util.List;

public class JacksonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private JacksonUtil() {}
    static {
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        //key可以不带双引号
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        //key value 可以是单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true) ;
        //允许出现特殊字符和转义符
        //objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
    }

    public static ObjectMapper getInstance() {
        return objectMapper;
    }



    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    public static Object getObjectFromJson(String json,Class<?> collectionClass,Class<?>... elementClasses){
        JavaType javaType=getCollectionType(collectionClass,elementClasses);
        try {
            return  objectMapper.readValue(json, javaType);
        } catch (Exception e) {
            throw new RuntimeException("error");
        }
    }
    /**
     * description功能描述:
     *  把字符串转换成java对象集合对象
     * @param: json 字符串
     *         objectClass：目标类class
     * @return:  返回对应的对象实例
     * @Author:zhanghuajie
     * @Date: 2018/4/25 19:06
     */
    public static <T> List<T> getListFromJson(String json, Class<T> objectClass){
        JavaType javaType = JacksonUtil.getCollectionType(ArrayList.class,objectClass);
        try {
            return objectMapper.readValue(json,javaType);
        } catch (Exception e) {
            throw new RuntimeException("json解析错误");
        }
    }
    /**
     * description功能描述:
     *  把字符串转换成java对象
     * @param: json 字符串
     *         objectClass：目标类class
     * @return:  返回对应的对象实例
     * @Author:zhanghuajie
     * @Date: 2018/4/25 19:06
     */
    public static <T> T fromJsonToObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("解析json错误");
        }
    }

    /**
     * description功能描述:
     * 把java对象转换成json字符串
     * @param: object 要转换的而对象
     * @return:  返回对应的json字符串
     * @Author:zhanghuajie
     * @Date: 2018/4/25 19:08
     */
    public static String fromObjectToJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("解析对象错误");
        }
    }

}
