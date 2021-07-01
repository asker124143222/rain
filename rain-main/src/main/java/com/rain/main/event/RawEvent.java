package com.rain.main.event;

import lombok.Data;

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
}
