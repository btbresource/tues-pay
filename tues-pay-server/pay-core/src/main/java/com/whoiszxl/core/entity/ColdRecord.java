package com.whoiszxl.core.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 转冷钱包记录
 */
@Data
@Entity
public class ColdRecord implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer currencyId;

    private String currencyName;

    private BigDecimal amount;

    private String txHash;

    private String fromAddress;

    private String toAddress;

    private Date upchainAt;

    private Date upchainSuccessAt;

    private Integer upchainStatus;

    private Date createdAt;

    private Date updatedAt;


}