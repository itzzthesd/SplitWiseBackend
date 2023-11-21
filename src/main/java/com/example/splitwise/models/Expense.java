package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Expense extends BaseModel{

    private String description;

    private int amount;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "expense")
    private List<ExpenseUser> expenseUsers;

    @ManyToOne
    private Group group;
}
