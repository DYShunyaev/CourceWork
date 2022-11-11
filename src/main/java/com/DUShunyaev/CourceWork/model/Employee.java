package com.DUShunyaev.CourceWork.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Date birthday;

    @Column
    private String department;

    @Column
    private Date dateGetJob;

    @Column
    private int salary;
}
