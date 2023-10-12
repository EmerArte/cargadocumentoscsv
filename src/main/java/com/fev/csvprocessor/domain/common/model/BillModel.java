package com.fev.csvprocessor.domain.common.model;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BillModel {
    private BigInteger billCode;
    private String name;
    private String lastName;
    private BigDecimal amount;
    private LocalDateTime paymentExpirationDate;
    private LocalDateTime paymentDueDate;
    private String status;
}
