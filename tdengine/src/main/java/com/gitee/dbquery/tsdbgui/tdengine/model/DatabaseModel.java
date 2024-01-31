package com.gitee.dbquery.tsdbgui.tdengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DatabaseModel
 *
 * @author pc
 * @since 2024/01/31
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DatabaseModel {
    private String name;
    private List<TableModel> tbList;
}
