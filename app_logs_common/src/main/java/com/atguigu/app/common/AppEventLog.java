package com.atguigu.app.common;

import java.util.Map;

/**
 * Created by atguigu on 2017/11/8
 */
public class AppEventLog extends AppBaseLog {

    private String eventId;                      //事件唯一标识
    private Long eventDurationSecs;                //事件持续时长
    private Map<String,String> paramKeyValueMap;   //参数名/值对

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Long getEventDurationSecs() {
        return eventDurationSecs;
    }

    public void setEventDurationSecs(Long eventDurationSecs) {
        this.eventDurationSecs = eventDurationSecs;
    }

    public Map<String, String> getParamKeyValueMap() {
        return paramKeyValueMap;
    }

    public void setParamKeyValueMap(Map<String, String> paramKeyValueMap) {
        this.paramKeyValueMap = paramKeyValueMap;
    }
}
