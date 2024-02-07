package com.devfree.mercadinho.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_stock")
public class stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long qtnEstoque;
}
