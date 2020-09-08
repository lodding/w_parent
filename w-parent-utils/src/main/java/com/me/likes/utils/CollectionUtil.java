package com.me.likes.utils;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: w_parent->CollectionUtil
 * @description:
 * @author: szh
 * @create: 2020-07-30 15:09
 **/
public class CollectionUtil {
    public CollectionUtil() {
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Object[] array) {
        return !isNotEmpty(array);
    }

    public static boolean isNotEmpty(Object[] array) {
        return array != null && array.length > 0;
    }

    public static boolean isSizeEquals(Collection col0, Collection col1) {
        if (col0 == null) {
            return col1 == null;
        } else if (col1 == null) {
            return false;
        } else {
            return col0.size() == col1.size();
        }
    }

    public static <T> Collection<T> subtract(@NotNull final Collection<T> minuendCollection, @NotNull final Collection<T> subtrahendCollection) {
        ArrayList<T> minuendList = new ArrayList(minuendCollection);
        Iterator<T> subtrahendIterator = subtrahendCollection.iterator();
        synchronized(minuendList) {
            while(subtrahendIterator.hasNext()) {
                T next = subtrahendIterator.next();
                minuendList.remove(next);
            }

            return minuendList;
        }
    }
}