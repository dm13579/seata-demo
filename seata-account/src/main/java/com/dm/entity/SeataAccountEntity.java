package com.dm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode()
@TableName("seata_account")
public class SeataAccountEntity implements Serializable {
    private Long id;
    private String username;
    private String phone;
    private Integer status;
    private String personalized_signature;
    private String money;
}