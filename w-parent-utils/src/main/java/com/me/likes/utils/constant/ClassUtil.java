package com.me.likes.utils.constant;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: w_parent->ClassUtil
 * @description:
 * @author: szh
 * @create: 2020-07-30 15:47
 **/
public class ClassUtil {

    public static final String ARRAY_SUFFIX = "[]";
    public static final String CGLIB_CLASS_SEPARATOR = "$$";
    public static final String CLASS_FILE_SUFFIX = ".class";
    private static final String INTERNAL_ARRAY_PREFIX = "[";
    private static final String NON_PRIMITIVE_ARRAY_PREFIX = "[L";
    private static final char PACKAGE_SEPARATOR = '.';
    private static final char PATH_SEPARATOR = '/';
    private static final char INNER_CLASS_SEPARATOR = '$';
    private static final Map<Class<?>, Class<?>> PRIMITIVE_WRAPPER_TYPE_MAP = new IdentityHashMap(8);
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TYPE_TO_WRAPPER_MAP = new IdentityHashMap(8);
    private static final Map<String, Class<?>> PRIMITIVE_TYPE_NAME_MAP = new HashMap(32);
    private static final Map<String, Class<?>> COMMON_CLASS_CACHE = new HashMap(64);

    public ClassUtil() {
    }

    public static <T> T newInstance(Class<T> clazz, Object... initargs) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        try {
            T newInstance = clazz.getDeclaredConstructor().newInstance(initargs);
            return newInstance;
        } catch (Throwable var3) {
            throw var3;
        }
    }

    public static <T> T newInstance(Class<T> clazz) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        try {
            T newInstance = clazz.getDeclaredConstructor().newInstance();
            return newInstance;
        } catch (Throwable var2) {
            throw var2;
        }
    }
}