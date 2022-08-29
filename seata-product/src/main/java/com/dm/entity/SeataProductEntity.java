package com.dm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode()
@TableName("seata_product")
public class SeataProductEntity implements Serializable {
    private Long id;
}
