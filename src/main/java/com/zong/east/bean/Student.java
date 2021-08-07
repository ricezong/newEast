package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName Course
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 15:51
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
public class Student {
    private Long id;
    private String name;
    private String phoneNumber;
}
