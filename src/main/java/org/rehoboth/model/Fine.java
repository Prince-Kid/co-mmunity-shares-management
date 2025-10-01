package org.rehoboth.model;

import jakarta.perisistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "fine")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Fine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int weekNumber;
    private String reason;
    private double amount;
}
