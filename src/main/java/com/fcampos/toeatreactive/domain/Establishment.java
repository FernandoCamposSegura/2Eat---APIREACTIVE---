package com.fcampos.toeatreactive.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "establishments")
public class Establishment {
    @Id
    private String Id;

    @Field
    private String code;

    @Field
    private String name;

    @Field
    private String description;

    @Field
    private String address;
    
    @Field
    private double latitude;

    @Field
    private double longitude;
}
