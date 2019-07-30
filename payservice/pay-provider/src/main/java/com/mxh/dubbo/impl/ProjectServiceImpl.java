package com.mxh.dubbo.impl;

import com.mxh.dubbo.api.ProjectService;
import org.springframework.stereotype.Service;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
    @Override
    public String sayHello(String name) {
        return  "Hello :"+name+",I am from china";
    }
}
