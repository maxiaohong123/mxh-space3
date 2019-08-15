package com.mxh.dubbo.impl;

import com.mxh.dubbo.api.PayService;

public class PayServiceImpl implements PayService {
    @Override
    public String getPayCount(String name) {
        return name+":12 number";
    }
}
