package com.example.parcial02ncapas.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tabla-data")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TablaPrueba1 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

}

