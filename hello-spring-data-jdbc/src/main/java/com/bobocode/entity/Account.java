package com.bobocode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * {@link Account} is an entity that is stored in the database table called "accounts". It's primary key is
 * represented by autoincrement column {@code id}.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
// todo: provide entity mapping according to the javadoc
public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private LocalDateTime creationTime;
    private BigDecimal balance = BigDecimal.ZERO.setScale(2);
}



