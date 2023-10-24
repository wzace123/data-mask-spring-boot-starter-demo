package org.wz.datamasking.demo.handler;

import org.springframework.stereotype.Component;
import org.wz.datamask.constant.FieldType;
import org.wz.datamask.handle.DataMaskHandler;

/**
 * Custom implementation
 */
@Component
public class MyUserNameMaskHandler implements DataMaskHandler {
    @Override
    public String doMask(String fieldValue) {
        // do something
        return "custom_implementation_of_" + fieldValue;
    }

    @Override
    public String getFieldType() {
        return FieldType.USER_NAME;
    }

    @Override
    public String getId() {
        return "my_id";
    }
}
