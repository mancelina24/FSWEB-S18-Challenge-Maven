package com.workintech.fswebs18challengemaven.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="card", schema = "FSWEB18Challenge")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "value")
    private Integer value;

    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name="color")
    @Enumerated(EnumType.STRING)
    private Color color;
}
