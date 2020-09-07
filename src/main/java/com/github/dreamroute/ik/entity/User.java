package com.github.dreamroute.ik.entity;

import com.github.dreamroute.mybatis.pro.core.annotations.Id;
import com.github.dreamroute.mybatis.pro.core.annotations.Table;
import lombok.Data;

/**
 * @author w.dehai
 */
@Data
@Table(name = "smart_user")
public class User {
    @Id
    private Long id;
    private String name;
    private String password;
}
