package com.yang.crm.workbench.service.impl;

import com.yang.crm.workbench.domain.Activity;
import com.yang.crm.workbench.mapper.ActivityMapper;
import com.yang.crm.workbench.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public int saveCreateActivity(Activity activity) {
        int i = activityMapper.insertActivity(activity);
        return i;
    }
}
