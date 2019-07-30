package com.mxh.dubbo.impl;

import com.mxh.dubbo.api.SuitService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("suitService")
public class SuitServiceImpl implements SuitService {
    @Override
    public List<String> selectAllName(String name) {
       List<String> list = new ArrayList<>();
       list.add("111");
       list.add("222");
       list.add(name);
       return  list;
    }
}
