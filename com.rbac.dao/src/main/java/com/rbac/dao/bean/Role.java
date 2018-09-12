package com.rbac.dao.bean;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuyuyong
 * @since 2018-09-12
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private Integer id;
    /**
     * 角色
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Role{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}
