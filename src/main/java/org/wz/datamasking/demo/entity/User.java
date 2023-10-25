package org.wz.datamasking.demo.entity;

import org.wz.datamasking.demo.handler.MyUserNameMaskHandler;
import lombok.Data;
import org.wz.datamask.annotation.MaskedField;
import org.wz.datamask.constant.FieldType;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @MaskedField(value = FieldType.USER_NAME, groups = {"myGroup"})
    private String name;
    @MaskedField(value = FieldType.ID_CARD, groups = {"myGroup"})
    private String idCard;
    @MaskedField(value = FieldType.FIXED_PHONE, groups = {"myGroup", "myGroup2"})
    private String fixedPhone;
    @MaskedField(value = FieldType.MOBILE_PHONE)
    private String mobilePhone;
    @MaskedField(value = FieldType.ADDRESS)
    private String address;
    @MaskedField(value = FieldType.EMAIL)
    private String email;
    @MaskedField(value = FieldType.PASSWORD)
    private String password;
    @MaskedField(value = FieldType.CAR_LICENSE)
    private String carLicense;
    @MaskedField(value = FieldType.BANK_CARD)
    private String bankCard;
    @MaskedField(value = FieldType.IPV4)
    private String ipv4;
    @MaskedField(value = FieldType.IPV6)
    private String ipv6;

    /**
     * Custom implementation
     * @see MyUserNameMaskHandler
     */
    @MaskedField(value = FieldType.USER_NAME, id = "my_id")
    private String userName;
}
