package com.patika.paycore.HelperProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {


    private Float amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private String transactionDescription;
    private Boolean isSuccess;
    private Customer customer;

}
