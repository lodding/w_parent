package com.me.common.annotations;

import java.lang.annotation.*;

/**
 * @author : sizhenhui <p>
 * @date :  </p>
 * @time : 14:59 </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE, ElementType.MODULE})
public @interface Warning {
    String value();
}
