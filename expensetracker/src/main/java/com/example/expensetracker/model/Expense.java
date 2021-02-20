package com.example.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_expenses") //because we have a different table name
@Setter
@Getter
public class Expense {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-generated
    private Long id;

    private String expense;

    private String description;
    
    private BigDecimal amount;
}
