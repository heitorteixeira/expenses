package com.expenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Expense {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "value", nullable = false)
    private double value;

    @Column(name = "created", nullable = false)
    private Instant created;

    @Column(name = "paid", nullable = false)
    private boolean paid;

    @ManyToMany
    @JoinTable(
            name = "expense_user",
            joinColumns = @JoinColumn(name = "expense_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @Builder.Default
    private List<User> users = new ArrayList<>();
}
