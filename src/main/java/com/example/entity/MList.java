package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MList {
    private Integer id;
    private String name;
    //对应用户
    private Integer uid;
    private Integer sum;

//    m_list
//    id,mid,lid


}
