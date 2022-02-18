package com.patika.paycore.HelperProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private Integer id;
    private TransactionType transactionType;
    private Float amount;
    private Date transactionDate;
    private String transactionDescription;
    private Boolean isSuccess;
    private Customer customer;

}
