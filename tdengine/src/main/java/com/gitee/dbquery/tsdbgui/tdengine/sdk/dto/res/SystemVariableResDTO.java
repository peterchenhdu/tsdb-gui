package com.gitee.dbquery.tsdbgui.tdengine.sdk.dto.res;

import com.gitee.dbquery.tsdbgui.tdengine.sdk.annotation.TdField;
import lombok.Data;

/**
 * @author chenpi
 * @since 2023/8/11
 **/
@Data
public class SystemVariableResDTO {
    @TdField
    private String name;
    @TdField
    private String value;
}