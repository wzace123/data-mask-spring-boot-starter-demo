package com.wz.datamasking.demo.entity;

import lombok.Data;
import org.wz.datamask.annotation.MaskedField;
import org.wz.datamask.enums.MaskedType;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @MaskedField(value = MaskedType.USER_NAME)
    private String name;
    @MaskedField(value = MaskedType.ID_CARD)
    private String idCard;
    @MaskedField(value = MaskedType.FIXED_PHONE)
    private String fixedPhone;
    @MaskedField(value = MaskedType.MOBILE_PHONE)
    private String mobilePhone;
    @MaskedField(value = MaskedType.ADDRESS)
    private String address;
    @MaskedField(value = MaskedType.EMAIL)
    private String email;
    @MaskedField(value = MaskedType.PASSWORD)
    private String password;
    @MaskedField(value = MaskedType.CAR_LICENSE)
    private String carLicense;
    @MaskedField(value = MaskedType.BANK_CARD)
    private String bankCard;
    @MaskedField(value = MaskedType.IPV4)
    private String ipv4;
    @MaskedField(value = MaskedType.IPV6)
    private String ipv6;
}
