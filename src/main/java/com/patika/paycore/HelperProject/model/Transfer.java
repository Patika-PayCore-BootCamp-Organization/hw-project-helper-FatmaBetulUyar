package com.patika.paycore.HelperProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfer implements Serializable {

    @Enumerated(EnumType.ORDINAL)
    private TransferType transferType;

    private Float Amount;
    private Date transferDate;
    private String transferDescription;
    private Boolean isSuccess;
    private Customer customer;
    private Recipient recipient;
}
