package com.mongodb;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Employee {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;


}
