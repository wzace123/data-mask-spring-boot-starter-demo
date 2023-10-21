package com.wz.datamasking.demo.entity;

import lombok.Data;
import org.wz.datamask.annotation.MaskedField;
import org.wz.datamask.enums.FieldType;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @MaskedField(value = FieldType.USER_NAME)
    private String name;

    @MaskedField(value = FieldType.MOBILE)
    private String mobile;

    @MaskedField(value = FieldType.ADDRESS)
    private String address;

    @MaskedField(value = FieldType.ID_CARD)
    private String idCard;
}
