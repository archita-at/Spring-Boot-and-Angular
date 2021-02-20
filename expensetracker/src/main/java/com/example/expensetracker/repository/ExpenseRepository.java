package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*@Repository is a marker annotation, which indicates that the underlying interface is a repository.
    A repository is created by extending specific repository interfaces,
    such as CrudRepository, PagingAndSortingRepository, or JpaRepository.*/
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    //We define a repository interface for each domain entity in the application.
    //In this case Domain Entity is "Expense" (@Entity specified in model class)
    //A repository contains methods for performing CRUD operations, sorting and paginating data.
    /*JpaRepository is JPA specific extension of Repository.
        It contains the full API of CrudRepository and PagingAndSortingRepository.
        So it contains API for basic CRUD operations and also API for pagination and sorting.*/
}
