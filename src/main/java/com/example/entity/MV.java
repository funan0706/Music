package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MV {
    private Integer id;
    private String name;
    private String author;
    private String url;
    private String time;
    private String pic;
}
