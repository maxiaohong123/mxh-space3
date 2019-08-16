package com.mxh.dubbo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private int id;
    private String orderNo;
    private String createTime;
    private String orderAddr;

}
