package com.fev.csvprocessor.infrastructure.common.dto;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
@Builder(toBuilder = true)
@ToString
@Getter
public class BillDto {
    private BigInteger billCode;
    private String name;
    private String lastName;
    private BigDecimal amount;
    private LocalDateTime paymentExpirationDate;
    private LocalDateTime paymentDueDate;
    private String status;
}
