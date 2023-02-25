package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Music {
    private Integer id;
    private String title;
    private String artist;
    private String time;
    private String src;
    private String pic;
    private String style;
}