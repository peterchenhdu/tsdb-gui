package com.gitee.dbquery.tsdbgui.tdengine.sdk.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author chenpi
 * @since 2021/12/13
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface TdField {
    String value() default "";
}