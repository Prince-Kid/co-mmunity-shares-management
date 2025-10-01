package org.rehoboth.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "contributions")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class Contributions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int weekNumber;
    private double amount;
    private String status;

    @ManyToOne
    private User user;
}
