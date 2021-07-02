package com.rain.supports.event;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 13:33
 * @Description: TODO
 **/
@Data
public class RawEvent {
    private Long id;
    private String type;
    private String comment;
    private Date eventDate;

    @Override
    public String toString() {
        return "RawEvent{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", comment='" + comment + '\'' +
                ", eventDate=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(eventDate) +
                '}';
    }
}
