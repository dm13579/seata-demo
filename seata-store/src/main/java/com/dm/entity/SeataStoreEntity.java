package com.dm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode()
@TableName("seata_store")
public class SeataStoreEntity implements Serializable {
    private Long id;
    private Long productId;
    private BigDecimal price;
    private Integer stock;
}
