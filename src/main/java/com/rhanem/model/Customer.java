package com.rhanem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    private Integer id;
    private  String name;
    private String email;
    private Integer age;
}
